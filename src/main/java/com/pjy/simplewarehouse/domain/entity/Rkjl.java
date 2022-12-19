package com.pjy.simplewarehouse.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @TableName rkjl
 */
@TableName(value ="rkjl")
public class Rkjl implements Serializable {
    /**
     *
     */
    @TableId
    private Integer id;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private Date time;

    /**
     *
     */
    private Integer num;

    /**
     *
     */
    private Integer houseid;

    /**
     *
     */
    private Integer groupId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public Rkjl setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Rkjl setName(String name) {
        this.name = name;
        return this;
    }

    public Date getTime() {
        return time;
    }

    public Rkjl setTime(Date time) {
        this.time = time;
        return this;
    }

    public Integer getNum() {
        return num;
    }

    public Rkjl setNum(Integer num) {
        this.num = num;
        return this;
    }

    public Integer getHouseid() {
        return houseid;
    }

    public Rkjl setHouseid(Integer houseid) {
        this.houseid = houseid;
        return this;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public Rkjl setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
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
        Rkjl other = (Rkjl) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getHouseid() == null ? other.getHouseid() == null : this.getHouseid().equals(other.getHouseid()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getHouseid() == null) ? 0 : getHouseid().hashCode());
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
        sb.append(", name=").append(name);
        sb.append(", time=").append(time);
        sb.append(", num=").append(num);
        sb.append(", houseid=").append(houseid);
        sb.append(", groupId=").append(groupId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
