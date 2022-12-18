package com.pjy.simplewarehouse.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pjy.simplewarehouse.common.api.R;
import com.pjy.simplewarehouse.common.error.ApiException;
import com.pjy.simplewarehouse.common.error.ErrorCode;
import com.pjy.simplewarehouse.dao.CargoMapper;
import com.pjy.simplewarehouse.dao.CgjlMapper;
import com.pjy.simplewarehouse.domain.dto.CargoAddDTO;
import com.pjy.simplewarehouse.domain.dto.CgjlDTO;
import com.pjy.simplewarehouse.domain.entity.Cargo;
import com.pjy.simplewarehouse.domain.entity.Cgjl;
import com.pjy.simplewarehouse.service.PurchasingService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 功能描述
 *
 * @author: PJY
 * @date: 2022年12月18日 14:59
 */
@Service
public class PurchasingServiceImpl implements PurchasingService {

    @Resource
    CargoMapper cargoMapper;
    @Resource
    CgjlMapper cgjlMapper;

    @Override
    public R history(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Cgjl> cgjls = (List<Cgjl>) cgjlMapper.selectList(null);
        PageInfo<Cgjl> page = new PageInfo<>(cgjls);
        return R.ok().put(page);
    }

    @Override
    public R getCategoryList() {
        List<String> categorys= cargoMapper.getCategoryList();
        return R.ok().put(categorys);
    }

    @Override
    public R selectCargoByCategory(String category, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Cargo> cargos = cargoMapper.selectByCategory(category);
        PageInfo<Cargo> page = new PageInfo<>(cargos);
        return R.ok().put(page);
    }

    @Override
    public R addCargo(CargoAddDTO dto) {
        Cargo cargo = cargoMapper.selectOne(new QueryWrapper<Cargo>().eq("name",dto.getName()));
        if(cargo!=null){
            throw new ApiException(ErrorCode.CARGO_EXISTED);
        }
        int add = cargoMapper.add(dto);
        if(add==0){
            throw new ApiException(ErrorCode.CARGO_ERROR);
        }
        return R.ok();
    }

    @Override
    public R generate( List<CgjlDTO> list) {
        int time = (int) System.currentTimeMillis();
        int i = cgjlMapper.insertList(list, time);
        if(i==0) throw new ApiException(ErrorCode.CG_ERROR);
        return R.ok();
    }
}
