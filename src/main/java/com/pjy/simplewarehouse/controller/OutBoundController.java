package com.pjy.simplewarehouse.controller;

import com.pjy.simplewarehouse.common.api.R;
import com.pjy.simplewarehouse.domain.dto.CargoSearchDTO;
import com.pjy.simplewarehouse.domain.dto.CkjlDTO;
import com.pjy.simplewarehouse.service.CargoService;
import com.pjy.simplewarehouse.service.OutBoundService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 功能描述
 *
 * @author: PJY
 * @date: 2022年12月18日 13:47
 */
@RestController
@RequestMapping("/outbound")
public class OutBoundController {
    @Resource
    OutBoundService outBoundService;
    @Resource
    CargoService cargoService;

    @GetMapping("/history/{pageNum}/{pageSize}")
    public R history(@PathVariable Integer pageNum,@PathVariable Integer pageSize){
        return outBoundService.history(pageNum,pageSize );
    }

    @PutMapping("/update")
    public R update(@RequestBody List<CkjlDTO> list){
        return outBoundService.update(list);
    }

    @GetMapping("/all/{pageNum}/{pageSize}")
    public R listCargos(@PathVariable("pageNum")Integer pageNum,@PathVariable("pageSize")Integer pageSize){
        return cargoService.listAll(pageNum,pageSize);
    }

    @PostMapping("/search")
    public R search( @RequestBody CargoSearchDTO dto){
        return cargoService.search(dto);
    }

}
