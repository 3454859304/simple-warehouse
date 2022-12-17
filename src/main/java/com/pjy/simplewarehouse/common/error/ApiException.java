package com.pjy.simplewarehouse.common.error;

import com.baomidou.mybatisplus.extension.api.IErrorCode;

/**
 * 功能描述
 *
 * @author: PJY
 * @date: 2022年12月17日 15:08
 */
public class ApiException extends RuntimeException{

    private ErrorCode errorCode;

    public ApiException(ErrorCode errorCode) {
        super(errorCode.message);
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }
    public ErrorCode getErrorCode() {
        return errorCode;
    }
    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
