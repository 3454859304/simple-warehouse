package com.pjy.simplewarehouse.common.api;

import com.pjy.simplewarehouse.common.error.ErrorCode;

import java.io.Serializable;

/**
 * 功能描述
 * 统一返回
 * @author: PJY
 * @date: 2022年12月17日 0:42
 */
public class R implements Serializable {
    private static final long serialVersionUID = -4153430394359594346L;

    private String code;
    private String message;
    private Object data;

    private R(){}
    private R(String code,String message){
        this.setCode(code);
        this.setMessage(message);
    }
    private R(ErrorCode error){
        this.setCode(error.getCode());
        this.setMessage(error.getMessage());
    }

    public static R ok(){
        return new R(ErrorCode.OK);
    }
    public static R error(String code,String message){
        return new R(code,message);
    }
    public static R error(ErrorCode error){
        return new R(error);
    }

    public R put(Object data) {
        this.data=data;
        return this;
    }


    public String getCode() {
        return code;
    }

    public R setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public R setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public R setData(Object data) {
        this.data = data;
        return this;
    }

}
