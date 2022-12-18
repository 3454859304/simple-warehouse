package com.pjy.simplewarehouse.service;

import com.pjy.simplewarehouse.common.api.R;

/**
 * 功能描述
 *
 * @author: PJY
 * @date: 2022年12月18日 13:48
 */
public interface InBoundService {
    R getCglist(Integer pageNum,Integer pqgeSize);
}
