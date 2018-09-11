package com.mybatis.controller;

import com.mybatis.dao.UserDao;
import com.mybatis.dao.UserDao2;
import com.mybatis.model.UserDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserDao2 userDao2;

    /**
     * 注解方式
     *
     * @return
     */
    @RequestMapping("select")
    public List<UserDomain> select() {

        List<UserDomain> userDomains = userDao.selectUsers();

        return userDomains;
    }

    /**
     * xml方式
     *
     * @return
     */
    @RequestMapping("select2")
    public List<UserDomain> select2() {

        List<UserDomain> userDomains = userDao2.selectUsers();

        return userDomains;
    }

    @RequestMapping("insert")
    public int insert() {

        int insert = userDao.insert("zy", "00112233");

        return insert;
    }


}
