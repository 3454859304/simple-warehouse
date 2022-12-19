package com.pjy.simplewarehouse.service;

import com.pjy.simplewarehouse.common.api.R;
import com.pjy.simplewarehouse.domain.dto.CkjlDTO;

import java.util.List;

/**
 * 功能描述
 *
 * @author: PJY
 * @date: 2022年12月18日 13:49
 */
public interface OutBoundService {

    R history(Integer pageNum, Integer pageSize);

    R update(List<CkjlDTO> list);
}
