package com.pjy.simplewarehouse.domain.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.util.Date;

/**
 * 功能描述
 *
 * @author: PJY
 * @date: 2022年12月19日 15:56
 */
public class CkjlDTO {

    private Integer cargo_id;

    private Integer num;

    private static final long serialVersionUID = 1L;

    public Integer getCargo_id() {
        return cargo_id;
    }

    public CkjlDTO setCargo_id(Integer cargo_id) {
        this.cargo_id = cargo_id;
        return this;
    }

    public Integer getNum() {
        return num;
    }

    public CkjlDTO setNum(Integer num) {
        this.num = num;
        return this;
    }
}
