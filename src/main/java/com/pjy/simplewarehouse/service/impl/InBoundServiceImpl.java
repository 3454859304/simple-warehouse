package com.pjy.simplewarehouse.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pjy.simplewarehouse.common.api.R;
import com.pjy.simplewarehouse.common.error.ApiException;
import com.pjy.simplewarehouse.common.error.ErrorCode;
import com.pjy.simplewarehouse.dao.CargoMapper;
import com.pjy.simplewarehouse.dao.CgjlMapper;
import com.pjy.simplewarehouse.dao.RkjlMapper;
import com.pjy.simplewarehouse.domain.dto.RkjlDTO;
import com.pjy.simplewarehouse.domain.entity.Cargo;
import com.pjy.simplewarehouse.domain.entity.Cgjl;
import com.pjy.simplewarehouse.domain.entity.Rkjl;
import com.pjy.simplewarehouse.service.InBoundService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述
 *
 * @author: PJY
 * @date: 2022年12月18日 15:11
 */
@Service
public class InBoundServiceImpl implements InBoundService {
    @Resource
    CgjlMapper cgjlMapper;

    @Resource
    RkjlMapper rkjlMapper;

    @Resource
    CargoMapper cargoMapper;


    @Override
    public R getCglist(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Cgjl> cgjls = cgjlMapper.selectList(new QueryWrapper<Cgjl>().eq("end", 1));
        PageInfo pageInfo = new PageInfo<>(cgjls);
        return R.ok().put(pageInfo);
    }

    @Override
    public R update(List<Integer> cgIds) {
        ArrayList<RkjlDTO> rkjls = new ArrayList<>();
        for(Integer cgId:  cgIds){
            Cgjl cgjl = cgjlMapper.selectById(cgId);
            cgjlMapper.updateById(new Cgjl().setEnd(0).setId(cgId));
            Cargo cargo = cargoMapper.selectOne(new QueryWrapper<Cargo>().eq("name", cgjl.getName()));
            cargoMapper.update(new Cargo().setNumber(cgjl.getNumber()+cargo.getNumber()),
                    new QueryWrapper<Cargo>().eq("name",cgjl.getName()));
            rkjls.add(new RkjlDTO()
                    .setName(cgjl.getName())
                    .setNum(cgjl.getNumber())
                    .setHouseid(cargo.getHouseId()));
        }
        int groupId = (int) System.currentTimeMillis();
        int i = rkjlMapper.insertList(rkjls, groupId);
        if(i==0) throw new ApiException(ErrorCode.RK_ERROR);
        return R.ok();
    }

    @Override
    public R history(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Rkjl> rkjls = rkjlMapper.selectList(null);
        PageInfo pageInfo =new PageInfo(rkjls);
        return R.ok().put(pageInfo);
    }
}
