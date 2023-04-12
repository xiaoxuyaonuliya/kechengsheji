package com.xujie.utils;

import com.xujie.entity.User;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description: 登录VO
 **/
@Data
public class LoginVO implements Serializable {
    private Integer id;
    private String token;
    private User user;
    //省略getter、setter
    public LoginVO(){

    }
    public LoginVO(Integer id, String token, User user) {
        this.id = id;
        this.token = token;
        this.user = user;
    }
}