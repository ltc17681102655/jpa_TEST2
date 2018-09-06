package com.jdbc.controller;

import com.jdbc.entity.User;
import com.jdbc.mapper.MyRowMapper;
import com.mysql.jdbc.Connection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 查询list
     *
     * @return
     */
    @RequestMapping("/list")
    public List<User> getList() {
        List<User> users = jdbcTemplate.query("select * from user ", new MyRowMapper());
        return users;
    }

    /**
     * 查询单个对象
     *
     * @return
     */
    @RequestMapping("/oneObj")
    public User getOneObjec() {
        User user = jdbcTemplate.queryForObject("select * from user where name = ?", new MyRowMapper(), "ltc");
        return user;
    }

    /**
     * 查询单个值
     *
     * @return
     */
    @RequestMapping("/oneValue")
    public Object getOneValue() {
        Integer integer = jdbcTemplate.queryForObject("select count(*) from user ", Integer.class);
        return integer;
    }

    @RequestMapping("/add")
    public Object add() {

        int add = jdbcTemplate.update("INSERT INTO `myproject`.`user` (`name`, `age`, `desc`) " +
                "VALUES (?, ?, ?);\n ", "liu-tao", 14, "student");
        return add;
    }

    @RequestMapping("/update")
    public Object update() {

        String sql = "UPDATE `myproject`.`user` SET  `desc`=?  WHERE (`name`= ? ) ";

        int update = jdbcTemplate.update(sql, "abcdefg", "liu-tao");

        return update;
    }

    /**
     * 使用JDBC底层实现查询
     */
    @RequestMapping("/jdbc")
    public static void queryWithJDBC() {
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        String jdbcUrl = "jdbc:mysql://localhost:3306/myproject";

        try {
//            加载驱动
            Class.forName("com.mysql.jdbc.Driver");
//            创建连接
            conn = (Connection) DriverManager.getConnection(jdbcUrl, "root", "1234");
            String sql = "select * from user where name = ?";
//            预编译sql
            psmt = conn.prepareStatement(sql);
//            从1开始，没有就不需要
            psmt.setString(1, "ltc");
//            执行sql
            rs = psmt.executeQuery();
//            int num = psmt.executeUpdate(); //增删改，返回操作记录数

//            遍历结果集
            while (rs.next()) {
                //根据列名查询对应的值，也可以是位置序号
                String name = rs.getString("name");
                Integer age = rs.getInt("age");
                System.out.println(name);
                System.out.println(age);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                psmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
