package com.pjy.simplewarehouse.controller;

import com.pjy.simplewarehouse.common.api.R;
import com.pjy.simplewarehouse.service.InBoundService;
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
@RequestMapping("/inbound")
public class InBoundController {

    @Resource
    InBoundService inboundService;

    @GetMapping("/cgjl/{pageNum}/{pageSize}")
    public R getCgList(@PathVariable Integer pageNum,@PathVariable Integer pageSize){
        return inboundService.getCglist(pageNum,pageSize);
    }


    @PutMapping("/update")
    public R update(@RequestBody List<Integer> cgIds){
        return inboundService.update(cgIds);
    }

    @GetMapping("/history/{pageNum}/{pageSize}")
    public R history(@PathVariable Integer pageNum,@PathVariable Integer pageSize ){
        return inboundService.history(pageNum,pageSize);
    }

}
