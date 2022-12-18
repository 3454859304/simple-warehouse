package com.pjy.simplewarehouse.service;

import com.pjy.simplewarehouse.common.api.R;
import com.pjy.simplewarehouse.domain.dto.CargoAddDTO;
import com.pjy.simplewarehouse.domain.dto.CgjlDTO;

import java.util.List;

/**
 * 功能描述
 *
 * @author: PJY
 * @date: 2022年12月18日 14:00
 */

public interface PurchasingService {
    public R history(Integer pageNum, Integer pageSize);

    R getCategoryList();

    R selectCargoByCategory(String category, Integer pageNum, Integer pageSize);

    R addCargo(CargoAddDTO dto);

    R generate(List<CgjlDTO> list);
}
