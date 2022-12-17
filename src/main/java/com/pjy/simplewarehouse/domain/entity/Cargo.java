package com.pjy.simplewarehouse.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 *
 * @TableName cargo
 */
@TableName(value ="cargo")
public class Cargo implements Serializable {
    /**
     *
     */
    @TableId
    private Object id;

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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    public Object getId() {
        return id;
    }

    /**
     *
     */
    public void setId(Object id) {
        this.id = id;
    }

    /**
     *
     */
    public String getName() {
        return name;
    }

    /**
     *
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     */
    public String getManufacture() {
        return manufacture;
    }

    /**
     *
     */
    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    /**
     *
     */
    public Integer getNumber() {
        return number;
    }

    /**
     *
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     *
     */
    public String getCategory() {
        return category;
    }

    /**
     *
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     *
     */
    public Integer getHouseId() {
        return houseId;
    }

    /**
     *
     */
    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    /**
     *
     */
    public String getPicture() {
        return picture;
    }

    /**
     *
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Cargo other = (Cargo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getManufacture() == null ? other.getManufacture() == null : this.getManufacture().equals(other.getManufacture()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getHouseId() == null ? other.getHouseId() == null : this.getHouseId().equals(other.getHouseId()))
            && (this.getPicture() == null ? other.getPicture() == null : this.getPicture().equals(other.getPicture()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getManufacture() == null) ? 0 : getManufacture().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getHouseId() == null) ? 0 : getHouseId().hashCode());
        result = prime * result + ((getPicture() == null) ? 0 : getPicture().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", manufacture=").append(manufacture);
        sb.append(", number=").append(number);
        sb.append(", category=").append(category);
        sb.append(", houseId=").append(houseId);
        sb.append(", picture=").append(picture);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
