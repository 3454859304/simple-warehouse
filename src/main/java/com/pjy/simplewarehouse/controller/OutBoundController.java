package com.pjy.simplewarehouse.controller;

import com.pjy.simplewarehouse.service.OutBoundService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 功能描述
 *
 * @author: PJY
 * @date: 2022年12月18日 13:47
 */
@RestController
public class OutBoundController {
    @Resource
    OutBoundService outBoundService;

}
