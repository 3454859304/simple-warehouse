package com.pjy.simplewarehouse.domain.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * 功能描述
 *
 * @author: PJY
 * @date: 2022年12月18日 15:42
 */
public class CargoAddDTO implements Serializable {

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String manufacture;

    /**
     *
     */
    private Integer number;

    /**
     *
     */
    private String category;

    /**
     *
     */
    private Integer houseId;

    /**
     *
     */
    private String picture;

    /**
     *
     */
    private String description;

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public CargoAddDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getManufacture() {
        return manufacture;
    }

    public CargoAddDTO setManufacture(String manufacture) {
        this.manufacture = manufacture;
        return this;
    }

    public Integer getNumber() {
        return number;
    }

    public CargoAddDTO setNumber(Integer number) {
        this.number = number;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public CargoAddDTO setCategory(String category) {
        this.category = category;
        return this;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public CargoAddDTO setHouseId(Integer houseId) {
        this.houseId = houseId;
        return this;
    }

    public String getPicture() {
        return picture;
    }

    public CargoAddDTO setPicture(String picture) {
        this.picture = picture;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CargoAddDTO setDescription(String description) {
        this.description = description;
        return this;
    }
}
