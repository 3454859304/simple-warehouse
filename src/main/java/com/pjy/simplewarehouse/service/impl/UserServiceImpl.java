package com.pjy.simplewarehouse.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pjy.simplewarehouse.common.api.R;
import com.pjy.simplewarehouse.common.error.ApiException;
import com.pjy.simplewarehouse.common.error.ErrorCode;
import com.pjy.simplewarehouse.domain.entity.User;
import com.pjy.simplewarehouse.service.UserService;
import com.pjy.simplewarehouse.dao.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
* @author PJY
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-12-17 15:52:35
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public R login(User user) {
        User loginUser = this.baseMapper.selectById(user.getUserId());
        if(loginUser==null){
            throw new ApiException(ErrorCode.LOGIN_ERROR);
        }
        if(!loginUser.getUserPwd().equals(user.getUserPwd())){
            throw new ApiException(ErrorCode.LOGIN_ERROR);
        }
        logger.info("{}登录成功",loginUser.getUserId());
        return R.ok();
    }
}




