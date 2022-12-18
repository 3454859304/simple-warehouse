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
    LOGIN_ERROR("A0100", "登录失败"),
    CARGO_ERROR("A0200", "货物异常"),
    CARGO_NOTFUND("A0201", "货物不存在"),
    CARGO_EXISTED("A0202", "已存在该货物"),
    CG_ERROR("A0300", "采购异常"),
    RK_ERROR("A0400","入库异常"),
    CK_ERROR("A0500","出库异常"),

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
