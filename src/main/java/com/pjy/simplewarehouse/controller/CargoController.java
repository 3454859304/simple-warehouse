package com.pjy.simplewarehouse.controller;

import com.pjy.simplewarehouse.common.api.R;
import com.pjy.simplewarehouse.domain.dto.CargoSearchDTO;
import com.pjy.simplewarehouse.service.CargoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 功能描述
 *
 * @author: PJY
 * @date: 2022年12月18日 11:23
 */
@RestController
@RequestMapping("/cargo")
public class CargoController {
    @Resource
    CargoService cargoService;

    @GetMapping("/all/{pageNum}/{pageSize}")
    public R listAll(@PathVariable("pageNum")Integer pageNum,@PathVariable("pageSize")Integer pageSize){
        return cargoService.listAll(pageNum,pageSize);
    }

    @PostMapping("/search")
    public R search( @RequestBody CargoSearchDTO dto){
        return cargoService.search(dto);
    }

    @GetMapping("/category/{category}/{pageNum}/{pageSize}")
    public R selectByCategory(@PathVariable("category") String category,@PathVariable Integer pageNum,@PathVariable Integer pageSize){
        return cargoService.selectByCategory(category,pageNum,pageSize);
    }

    @GetMapping("/name/{name}")
    public R selectByName(@PathVariable String name){
        return cargoService.selectByName(name);
    }
}
