package com.pjy.simplewarehouse.common.error;

/**
 * 功能描述
 *
 * @author: PJY
 * @date: 2022年12月17日 14:57
 */
public enum ErrorCode {
    OK("00000","success"),
    ERROR_HAPPEND("00001","未知异常"),
    LOGIN_ERROR("A0200", "登录失败"),

    ;



    public String code;
    public String message;

    ErrorCode(String code, String message) {
        this.code=code;
        this.message=message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
