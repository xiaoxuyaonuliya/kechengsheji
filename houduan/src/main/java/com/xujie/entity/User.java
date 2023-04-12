package com.xujie.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Description: 用户实体类
 **/

@TableName(value = "user")
@Data
public class User {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String loginName;
    private String userName;
    private String password;
    private String sex;
    private String email;
    private String address;
    //省略getter、setter等

    public User() {
    }

    public User( String loginName, String userName, String password, String sex, String email, String address) {

        this.loginName = loginName;
        this.userName = userName;
        this.password = password;
        this.sex = sex;
        this.email = email;
        this.address = address;
    }
}