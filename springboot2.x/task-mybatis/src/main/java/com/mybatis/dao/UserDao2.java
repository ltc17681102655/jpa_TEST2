package com.mybatis.dao;

import com.mybatis.model.UserDomain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserDao2 {

    List<UserDomain> selectUsers();
}
