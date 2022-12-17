package com.pjy.simplewarehouse.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.pjy.simplewarehouse.common.api.R;
import com.pjy.simplewarehouse.domain.entity.User;

/**
* @author PJY
* @description 针对表【user】的数据库操作Service
* @createDate 2022-12-17 15:52:35
*/
public interface UserService extends IService<User> {
    public R login(User user);

}
