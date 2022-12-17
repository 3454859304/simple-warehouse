package com.pjy.simplewarehouse.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pjy.simplewarehouse.dao.CargoMapper;
import com.pjy.simplewarehouse.domain.entity.Cargo;
import com.pjy.simplewarehouse.service.CargoService;
import org.springframework.stereotype.Service;

/**
* @author PJY
* @description 针对表【cargo】的数据库操作Service实现
* @createDate 2022-12-17 19:40:47
*/
@Service
public class CargoServiceImpl extends ServiceImpl<CargoMapper, Cargo>
    implements CargoService {

}




