package com.pjy.simplewarehouse.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pjy.simplewarehouse.domain.dto.CargoAddDTO;
import com.pjy.simplewarehouse.domain.dto.CargoSearchDTO;
import com.pjy.simplewarehouse.domain.entity.Cargo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author PJY
* @description 针对表【cargo】的数据库操作Mapper
* @createDate 2022-12-17 19:40:47
* @Entity generator.domain/entity.Cargo
*/
@Mapper
public interface CargoMapper extends BaseMapper<Cargo> {

    List<Cargo> selectAll();

    public List<Cargo> selectByCategory(String category);

    List<String> getCategoryList();

    List<Cargo> search(CargoSearchDTO dto);

    int add(CargoAddDTO dto);

}




