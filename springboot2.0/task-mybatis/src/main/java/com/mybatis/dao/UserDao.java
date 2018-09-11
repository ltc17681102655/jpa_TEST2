package com.mybatis.dao;

import com.mybatis.model.UserDomain;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {
    @Insert("INSERT INTO `myproject`.`t_user` (`userId`, `userName`, `password`, `phone`) VALUES (2, #{name}, #{password}, '2233');")
    int insert(@Param("name") String name , @Param("password")String password);

    @Select("SELECT * from t_user")
    List<UserDomain> selectUsers();
}
