package com.ltc.demo;

import domain.User;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Demo2 {

    @Test
    public void demo1() {
        ArrayList<User> users = new ArrayList<User>();
        User user = new User();
        users.add(user);
        users.stream().forEach(c -> c.setName("ltc"));
        System.out.println(users);

        System.out.println("----------------------");

        ArrayList<User> users2 = new ArrayList<User>();
        users2.stream().forEach(c -> c.setName("ltc"));
        System.out.println(users2);
    }


    @Test
    public void demo2() {
        ArrayList<User> users = new ArrayList<User>();
        User user = new User();
        user.setName("ltc");
        user.setAge(20);
        user.setId(1l);
        users.add(user);


        //groupingBy特殊用法
        Map<String, List<User>> collect = users.stream().collect(Collectors.groupingBy(c -> c.getId() + "-" + c.getAge(), Collectors.toList()));

        System.out.println(collect);
    }


    @Test
    public void demo3() {
        HashMap<String, List<Integer>> stringStringHashMap = new HashMap<>();
        List<Integer> integers = stringStringHashMap.get("11");
        Integer integer = integers.get(0);
        System.out.println(integer);
    }


    @Test
    public void demo4() {
        final ArrayList<User> users = new ArrayList<User>();
        User user = new User();
        user.setId(1l);
        user.setName("ltc");
        users.add(user);

        Optional<User> ltc = users.stream().filter(c -> c.getId().equals(2l) && c.getName().equals("ltc")).findFirst();

        System.out.println(ltc);
        if (ltc.isPresent() && ltc != null) {
            System.out.println(ltc.get());
        }
    }

    @Test
    public void demo5() {
        SimpleDateFormat formatterTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //createdTime: "2018-01-24 17:13:49"
        String dateString = formatterTime.format(new Date());
        System.out.println(dateString);
    }

    @Test
    public void demo6() {
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        Integer id = 1005088362;
        integerStringHashMap.put(id, "ltc");

        Long id2 = 1005088362l;
        String s = integerStringHashMap.get(Integer.valueOf(id2 + ""));
        System.out.println(s);

    }

    @Test
    public void demo7() {
        Integer i = 0;
        Integer i2 = 19;
        Integer i3 = 20;
        Integer i4 = 39;
        Integer i5 = 40;


        System.out.println(i / 20 + 1);
        System.out.println(i2 / 20 + 1);
        System.out.println(i3 / 20 + 1);
        System.out.println(i4 / 20 + 1);
        System.out.println(i5 / 20 + 1);

    }


    @Test
    public void demo8() {

        String s = "456";
        System.out.println(s);
        System.out.println(s.intern());
    }

    @Test
    public void demo9() {

        System.out.println(new BigDecimal(0));
    }

    @Test
    public void demo10() {

        HashMap<String, Object> map = new HashMap<>();
        map.put("status", 1);
        System.out.println(map.get("status").equals(1));
    }


}
