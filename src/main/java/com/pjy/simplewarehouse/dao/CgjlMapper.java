package com.pjy.simplewarehouse.dao;

import com.pjy.simplewarehouse.domain.dto.CgjlDTO;
import com.pjy.simplewarehouse.domain.entity.Cgjl;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author PJY
* @description 针对表【cgjl】的数据库操作Mapper
* @createDate 2022-12-18 13:54:58
* @Entity com.pjy.simplewarehouse.domain.entity.Cgjl
*/
@Mapper
public interface CgjlMapper extends BaseMapper<Cgjl> {

    int insertList(List<CgjlDTO> list, int time);
}




