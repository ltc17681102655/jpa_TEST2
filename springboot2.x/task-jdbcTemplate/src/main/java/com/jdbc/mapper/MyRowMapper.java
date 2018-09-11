package com.jdbc.mapper;

import com.jdbc.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MyRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        String name = resultSet.getString("name");
        int age = resultSet.getInt("age");
        String desc = resultSet.getString("desc");

        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setDesc(desc);

        return user;
    }
}
