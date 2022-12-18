package com.pjy.simplewarehouse.dao;

import com.pjy.simplewarehouse.domain.entity.Warehouse;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author PJY
* @description 针对表【warehouse】的数据库操作Mapper
* @createDate 2022-12-18 13:54:17
* @Entity com.pjy.simplewarehouse.domain.entity.Warehouse
*/
@Mapper
public interface WarehouseMapper extends BaseMapper<Warehouse> {

}




