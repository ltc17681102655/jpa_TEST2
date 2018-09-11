package com.ecache.controller;

import com.ecache.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CacheConfig(cacheNames = "users")
public class EhcacheController {

    private static final Logger logger = LoggerFactory.getLogger(EhcacheController.class);

    private static final List<User> list = new ArrayList<>();

    static {
        User user = new User();
        user.setId(1);
        user.setAge(20);
        user.setName("ltc");
        user.setUuid("578519083");
        list.add(user);
    }

    @RequestMapping("/putEcache")
    @CachePut(key = "#p0")
    public User getUser(Integer id) {
        logger.info("存入ecache缓存中");
        return list.get(0);
    }

    @RequestMapping("/getFromCache")
    @Cacheable(key = "#p0")
    public User getFromCache(Integer id) {
        logger.info("查询功能，缓存未找到，直接读取数据库，ID为：" + id);
        return list.get(0);
    }

    @RequestMapping("/deleteCache")
    @CacheEvict(key = "#p0")
    public String deleteCache(Integer id) {
        logger.info("删除功能，删除缓存，直接删除数据库数据，ID为：" + id);
//        userRepository.delete(id);
        return "删除成功";
    }
}
