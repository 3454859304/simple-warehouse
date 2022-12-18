package com.pjy.simplewarehouse.domain.dto;

import java.io.Serializable;

/**
 * 功能描述
 *
 * @author: PJY
 * @date: 2022年12月18日 12:47
 */
public class CargoSearchDTO implements Serializable {

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
    private Integer numberMin;
    /**
     *
     */
    private Integer numberMax;
    /**
     *
     */
    private String category;

    /**
     *
     */
    private Integer houseId;

    private Integer pageNum;

    private Integer pageSize;

    private Integer offset;

    public Integer getOffset() {
        return offset;
    }

    public CargoSearchDTO setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    private static final long serialVersionUID = 1L;


    public String getName() {
        return name;
    }

    public CargoSearchDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getManufacture() {
        return manufacture;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public CargoSearchDTO setPageNum(Integer pageNum) {
        this.pageNum = pageNum;

        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public CargoSearchDTO setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public CargoSearchDTO setManufacture(String manufacture) {
        this.manufacture = manufacture;
        return this;
    }

    public Integer getNumberMin() {
        return numberMin;
    }

    public CargoSearchDTO setNumberMin(Integer numberMin) {
        this.numberMin = numberMin;
        return this;
    }

    public Integer getNumberMax() {
        return numberMax;
    }

    public CargoSearchDTO setNumberMax(Integer numberMax) {
        this.numberMax = numberMax;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public CargoSearchDTO setCategory(String category) {
        this.category = category;
        return this;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public CargoSearchDTO setHouseId(Integer houseId) {
        this.houseId = houseId;
        return this;
    }
}
