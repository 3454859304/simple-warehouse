package com.pjy.simplewarehouse.controller;

import com.pjy.simplewarehouse.common.api.R;
import com.pjy.simplewarehouse.domain.entity.User;
import com.pjy.simplewarehouse.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 功能描述
 *
 * @author: PJY
 * @date: 2022年12月17日 14:26
 */
@RestController
@RequestMapping("/api/user")
public class UserController {


    @Resource
    private UserService userService;
    @PostMapping("/login")
    public R login(@RequestBody User user){
        return userService.login(user);
    }
}
