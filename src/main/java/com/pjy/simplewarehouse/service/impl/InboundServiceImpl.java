package com.pjy.simplewarehouse.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pjy.simplewarehouse.common.api.R;
import com.pjy.simplewarehouse.dao.CgjlMapper;
import com.pjy.simplewarehouse.dao.RkjlMapper;
import com.pjy.simplewarehouse.domain.entity.Cgjl;
import com.pjy.simplewarehouse.service.InBoundService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 功能描述
 *
 * @author: PJY
 * @date: 2022年12月18日 15:11
 */
@Service
public class InboundServiceImpl implements InBoundService {
    @Resource
    CgjlMapper cgjlMapper;

    @Resource
    RkjlMapper rkjlMapper;


    @Override
    public R getCglist(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Cgjl> cgjls = cgjlMapper.selectList(new QueryWrapper<Cgjl>().eq("end", 1));
        PageInfo pageInfo = new PageInfo<>(cgjls);
        return R.ok().put(pageInfo);
    }
}
