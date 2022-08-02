package com.example.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public enum RespBeanEnum {

    //通用
    SUCCESS(200, "SUCCESS"),
    ERROR(500, "服务器异常"),

    //登录模块
    LOGIN_ERROR(500210, "用户名或者密码不正确"),
    MOBILE_ERROR(500211, "手机号码不正确"),
    BIND_ERROR(500212, "参数校验异常"),

    ;

    private final Integer code;
    private final String message;
}
