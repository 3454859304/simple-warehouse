package com.pjy.simplewarehouse.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pjy.simplewarehouse.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
* @author PJY
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-12-17 15:52:35
* @Entity generator.domain/entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




