package com.pjy.simplewarehouse;


import com.pjy.simplewarehouse.dao.*;
import com.pjy.simplewarehouse.domain.entity.*;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * 功能描述
 *
 * @author: PJY
 * @date: 2022年12月17日 20:09
 */
@SpringBootTest
public class MapperTests {
    Logger log = LoggerFactory.getLogger(MapperTests.class);

    @Resource
    UserMapper userMapper;
    @Resource
    CargoMapper cargoMapper;
    @Resource
    CgjlMapper cgjlMapper;
    @Resource
    CkjlMapper ckjlMapper;
    @Resource
    RkjlMapper rkjlMapper;
    @Test
    void userTest() {
        List<User> users = userMapper.selectList(null);
        log.info(String.valueOf(users));
    }
    @Test
    void caroTest(){
        List<Cargo> cargos = cargoMapper.selectList(null);
        log.info(String.valueOf(cargos));
        List<Cargo> cargos1 = cargoMapper.selectByCategory("书籍");
        log.info(String.valueOf(cargos1));
        List<Cargo> cargos2 = cargoMapper.selectByCategory("书籍");
        log.info(String.valueOf(cargos2));
    }
    @Test
    void cgjlTest() {
        List<Cgjl> cgjls = cgjlMapper.selectList(null);
        log.info(String.valueOf(cgjls));
    }
    @Test
    void ckjlTest(){
        List<Ckjl> ckjls = ckjlMapper.selectList(null);
        log.info(String.valueOf(ckjls));
    }
    @Test
    void rkjlTest(){
        List<Rkjl> rkjls = rkjlMapper.selectList(null);
        log.info(String.valueOf(rkjls));
    }
}
