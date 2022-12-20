package com.pjy.simplewarehouse.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pjy.simplewarehouse.common.api.R;
import com.pjy.simplewarehouse.common.error.ApiException;
import com.pjy.simplewarehouse.common.error.ErrorCode;
import com.pjy.simplewarehouse.dao.CargoMapper;
import com.pjy.simplewarehouse.domain.dto.CargoSearchDTO;
import com.pjy.simplewarehouse.domain.entity.Cargo;
import com.pjy.simplewarehouse.service.CargoService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author PJY
* @description 针对表【cargo】的数据库操作Service实现
* @createDate 2022-12-17 19:40:47
*/
@Service
public class CargoServiceImpl extends ServiceImpl<CargoMapper, Cargo>
    implements CargoService {

    @Override
    public R listAll(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Cargo> cargos = this.baseMapper.selectAll();
        PageInfo<Cargo> pageInfo = new PageInfo<>(cargos);
        return R.ok().put(pageInfo);
    }

    @Override
    public R search(CargoSearchDTO dto) {
        PageHelper.startPage(dto.getPageNum(),dto.getPageSize());
        List<Cargo> cargos= this.baseMapper.search(dto);
        PageInfo pageInfo = new PageInfo(cargos);
        return R.ok().put(pageInfo);
    }

    @Override
    public R selectByCategory(String category,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Cargo>cargos =this.baseMapper.selectByCategory(category);
        PageInfo<Cargo> page = new PageInfo<>(cargos);
        return R.ok().put(page);
    }

    @Override
    public R selectByName(String name) {
        Cargo cargo = this.baseMapper.selectOne(new QueryWrapper<Cargo>().eq("name", name));
        if(cargo==null) throw new ApiException(ErrorCode.CARGO_NOTFUND);
        return R.ok().put(cargo);
    }
}




