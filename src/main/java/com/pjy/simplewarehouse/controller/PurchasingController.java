package com.pjy.simplewarehouse.controller;

import com.pjy.simplewarehouse.common.api.R;
import com.pjy.simplewarehouse.dao.CargoMapper;
import com.pjy.simplewarehouse.domain.dto.CargoAddDTO;
import com.pjy.simplewarehouse.domain.dto.CgjlDTO;
import com.pjy.simplewarehouse.service.PurchasingService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 功能描述
 *
 * @author: PJY
 * @date: 2022年12月18日 13:59
 */
@RestController()
@RequestMapping("/purchasing")
public class PurchasingController {
    @Resource
    PurchasingService purchasingService;

    @GetMapping("/history/{pageNum}/{pageSize}")
    public R history(@PathVariable Integer pageNum,@PathVariable Integer pageSize){
        return purchasingService.history(pageNum,pageSize);
    }

    @GetMapping("/categorys")
    public R getCategoryList(){
        return purchasingService.getCategoryList();
    }

    @GetMapping("/category/{category}/{pageNum}/{pageSize}")
    public R selectCargoByCategory(@PathVariable String category,
                                   @PathVariable Integer pageNum,
                                   @PathVariable Integer pageSize){
        return purchasingService.selectCargoByCategory(category,pageNum,pageSize);
    }

    @PutMapping("/add")
    public R addCargo(@RequestBody CargoAddDTO dto){
        return purchasingService.addCargo(dto);
    }

    @PutMapping("/generate")
    public R generate(@RequestBody List<CgjlDTO> list){
        System.out.println(list.size());
        System.out.println(list);
        return purchasingService.generate(list);
    }


}
