package com.pjy.simplewarehouse.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pjy.simplewarehouse.common.api.R;
import com.pjy.simplewarehouse.domain.dto.CargoSearchDTO;
import com.pjy.simplewarehouse.domain.entity.Cargo;

/**
* @author PJY
* @description 针对表【cargo】的数据库操作Service
* @createDate 2022-12-17 19:40:47
*/
public interface CargoService extends IService<Cargo> {

    R listAll(Integer pageNum, Integer pageSize);

    R search(CargoSearchDTO dto);

    R selectByCategory(String category,Integer pageNum,Integer pageSize);

    R selectByName(String name);
}
