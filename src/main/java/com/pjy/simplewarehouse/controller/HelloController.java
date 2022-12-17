package com.pjy.simplewarehouse.controller;
import com.pjy.simplewarehouse.common.api.R;
import com.pjy.simplewarehouse.domain.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述
 *
 * @author: PJY
 * @date: 2022年12月17日 13:46
 */
@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello,springboot";
    }

    @GetMapping("/test")
    public R testJson(){
        return R.ok().put(new User().setUserId("wwdawf").setUserPwd(null));
    }

}
