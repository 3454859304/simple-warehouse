package com.pjy.simplewarehouse.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pjy.simplewarehouse.common.api.R;
import com.pjy.simplewarehouse.common.error.ApiException;
import com.pjy.simplewarehouse.common.error.ErrorCode;
import com.pjy.simplewarehouse.dao.CargoMapper;
import com.pjy.simplewarehouse.dao.CkjlMapper;
import com.pjy.simplewarehouse.domain.dto.CgjlDTO;
import com.pjy.simplewarehouse.domain.dto.CkjlDTO;
import com.pjy.simplewarehouse.domain.dto.RkjlDTO;
import com.pjy.simplewarehouse.domain.entity.Cargo;
import com.pjy.simplewarehouse.domain.entity.Cgjl;
import com.pjy.simplewarehouse.domain.entity.Ckjl;
import com.pjy.simplewarehouse.service.OutBoundService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述
 *
 * @author: PJY
 * @date: 2022年12月18日 15:12
 */
@Service
public class OutBoundServiceImpl implements OutBoundService {
    @Resource
    CkjlMapper ckjlMapper;
    @Resource
    CargoMapper cargoMapper;
    @Override
    public R history(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Ckjl> ckjls = ckjlMapper.selectList(null);
        PageInfo pageInfo = new PageInfo(ckjls);
        return R.ok().put(pageInfo);
    }

    @Override
    public R update(List<CkjlDTO> list) {

        ArrayList<Ckjl> ckjls = new ArrayList<>();

        for(CkjlDTO ckjlDTO:  list){
            Cargo cargo = cargoMapper.selectById(ckjlDTO.getCargo_id());
            if(cargo.getNumber()<ckjlDTO.getNum()){
                throw new ApiException(ErrorCode.CK_NOT_ENOUGH);
            }
            cargoMapper.updateById(cargo.setNumber(cargo.getNumber()-ckjlDTO.getNum()));
            ckjls.add(new Ckjl()
                    .setName(cargo.getName())
                    .setNum(ckjlDTO.getNum())
                    .setHouseid(cargo.getHouseId()));
        }

        int groupId = (int) System.currentTimeMillis();
        int i = ckjlMapper.insertList(ckjls, groupId);
        if(i==0) throw new ApiException(ErrorCode.RK_ERROR);
        return R.ok();


    }
}
