package com.pjy.simplewarehouse.service.impl;

import com.pjy.simplewarehouse.common.api.R;
import com.pjy.simplewarehouse.dao.CgjlMapper;
import com.pjy.simplewarehouse.dao.RkjlMapper;
import com.pjy.simplewarehouse.service.InBoundService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
    public R getCglist() {

        return R.ok();
    }
}
