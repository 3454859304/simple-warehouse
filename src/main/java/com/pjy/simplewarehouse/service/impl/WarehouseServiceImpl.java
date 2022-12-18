package com.pjy.simplewarehouse.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pjy.simplewarehouse.domain.entity.Warehouse;
import com.pjy.simplewarehouse.service.WarehouseService;
import com.pjy.simplewarehouse.dao.WarehouseMapper;
import org.springframework.stereotype.Service;

/**
* @author PJY
* @description 针对表【warehouse】的数据库操作Service实现
* @createDate 2022-12-18 13:54:17
*/
@Service
public class WarehouseServiceImpl extends ServiceImpl<WarehouseMapper, Warehouse>
    implements WarehouseService{

}




