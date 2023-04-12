package com.xujie.utils;

import lombok.Data;

/**
 * @Description: 统一结果封装
 **/
@Data
public class Result {
    //相应码
    private Integer code;
    //信息
    private String message;
    //返回数据
    private Object data;
    //省略getter、setter、构造方法

    public Result() {
    }

    public Result(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
