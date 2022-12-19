package com.pjy.simplewarehouse.service;

import com.pjy.simplewarehouse.common.api.R;

import java.util.List;

/**
 * 功能描述
 *
 * @author: PJY
 * @date: 2022年12月18日 13:48
 */
public interface InBoundService {

    R getCglist(Integer pageNum,Integer pqgeSize);

    R update(List<Integer> cgIds);

    R history(Integer pageNum,Integer pageSize);
}
