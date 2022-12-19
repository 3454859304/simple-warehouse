package com.pjy.simplewarehouse.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @TableName cgjl
 */
@TableName(value ="cgjl")
public class Cgjl implements Serializable {
    /**
     *
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     *
     */
    private Integer end;

    /**
     *
     */
    private Date time;

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

    /**
     *
     */
    private Integer groupId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     */
    public Cgjl setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     *
     */
    public Integer getEnd() {
        return end;
    }

    /**
     *
     */
    public Cgjl setEnd(Integer end) {
        this.end = end;return this;
    }

    /**
     *
     */
    public Date getTime() {
        return time;
    }

    /**
     *
     */
    public Cgjl setTime(Date time) {
        this.time = time;
        return this;
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
    public Cgjl setName(String name) {
        this.name = name;return this;
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
    public Cgjl setNumber(Integer number) {
        this.number = number;return this;
    }

    /**
     *
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     *
     */
    public Cgjl setPrice(BigDecimal price) {
        this.price = price;return this;
    }

    /**
     *
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     *
     */
    public Cgjl setGroupId(Integer groupId) {
        this.groupId = groupId;return this;
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
        Cgjl other = (Cgjl) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEnd() == null ? other.getEnd() == null : this.getEnd().equals(other.getEnd()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEnd() == null) ? 0 : getEnd().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", end=").append(end);
        sb.append(", time=").append(time);
        sb.append(", name=").append(name);
        sb.append(", number=").append(number);
        sb.append(", price=").append(price);
        sb.append(", groupId=").append(groupId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
