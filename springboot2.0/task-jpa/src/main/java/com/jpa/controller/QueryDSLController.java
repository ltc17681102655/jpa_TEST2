package com.jpa.controller;

import com.jpa.domain.QUser;
import com.jpa.domain.User;
import com.jpa.domain.UserDomainRepo;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class QueryDSLController {

    @Autowired
    private UserDomainRepo userDomainRepo;

    @Autowired
    @PersistenceContext
//    @Inject
    private EntityManager entityManager;

    private JPAQueryFactory queryFactory;

    @PostConstruct
    public void init() {
        queryFactory = new JPAQueryFactory(entityManager);
    }

    @RequestMapping("/insert")
    public User insert() {
        User user = new User();
        user.setName("ltc");
        user.setAddress("上海");
        user.setAge(20);
        User save = userDomainRepo.save(user);
        return save;
    }

    @RequestMapping("/find")
    public User find() {
        QUser quser = QUser.user;
//        List<Predicate> list = new ArrayList<Predicate>();
//        list.add(quser.name.eq("ltc"));
        User user = queryFactory.selectFrom(quser).where(quser.name.eq("ltc")).fetchOne();
        return user;

    }

    @RequestMapping("/all")
    public List<User> findAll() {
        QUser quser = QUser.user;
//        List<Predicate> list = new ArrayList<Predicate>();
//        list.add(quser.name.eq("ltc"));
        List<User> users = queryFactory.selectFrom(quser).where(quser.name.like("ltc")).fetch();
        return users;

    }

    /**
     * 条件查询
     *
     * @return
     */
    @RequestMapping("/condition")
    public Map<String, Object> condition() {
        QUser quser = QUser.user;
        JPAQuery<User> userJPAQuery = queryFactory.selectFrom(quser);

        /*
         * 封装条件
         */
        List<Predicate> predicates = new ArrayList<Predicate>();
        String userName = "ltc";
        String address = "上海";
        if (!StringUtils.isEmpty(userName)) {
            predicates.add(quser.name.like(userName));
        }
        if (!StringUtils.isEmpty(address)) {
            predicates.add(quser.address.eq(address));
        }


        /**
         * 查询
         */
        JPAQuery<User> query = queryFactory.selectFrom(quser).where(predicates.toArray(new Predicate[predicates.size()]));

        /**
         * limit
         */
        List<User> users = query.offset(0).limit(2).fetch();

        /**
         * count
         */
        long totalCount = query.fetchCount();

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("totalCount",totalCount);
        resultMap.put("users",users);

        return resultMap;

        /**
         * 结果
         */
//        {
//            totalCount: 7,
//                    users: [
//            {
//                id: 1,
//                        name: "ltc",
//                    address: "上海",
//                    age: 20
//            },
//            {
//                id: 2,
//                        name: "ltc",
//                    address: "上海",
//                    age: 20
//            }
//]
//        }
    }



}
