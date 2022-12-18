package com.pjy.simplewarehouse.domain.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 功能描述
 *
 * @author: PJY
 * @date: 2022年12月18日 18:22
 */
public class CgjlDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     *
     */
    private Integer end;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private Integer number;

    /**
     *
     */
    private BigDecimal price;

    public Integer getEnd() {
        return end;
    }

    public CgjlDTO setEnd(Integer end) {
        this.end = end;
        return this;
    }

    public String getName() {
        return name;
    }

    public CgjlDTO setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getNumber() {
        return number;
    }

    public CgjlDTO setNumber(Integer number) {
        this.number = number;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public CgjlDTO setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
}
