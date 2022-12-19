package com.pjy.simplewarehouse.domain.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 功能描述
 *
 * @author: PJY
 * @date: 2022年12月19日 15:27
 */
public class RkjlDTO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    private String name;

    private Integer num;

    private Integer houseid;


    public String getName() {
        return name;
    }

    public RkjlDTO setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getNum() {
        return num;
    }

    public RkjlDTO setNum(Integer num) {
        this.num = num;
        return this;
    }

    public Integer getHouseid() {
        return houseid;
    }

    public RkjlDTO setHouseid(Integer houseid) {
        this.houseid = houseid;
        return this;
    }
}
