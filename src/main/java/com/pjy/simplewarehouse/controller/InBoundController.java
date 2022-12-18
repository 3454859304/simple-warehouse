package com.pjy.simplewarehouse.controller;

import com.pjy.simplewarehouse.common.api.R;
import com.pjy.simplewarehouse.service.InBoundService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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

    @GetMapping("/cgjl")
    public R getCgList(){
        return inboundService.getCglist();
    }

}
