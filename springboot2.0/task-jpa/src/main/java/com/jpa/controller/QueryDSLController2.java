package com.jpa.controller;

import com.jpa.domain.QUser;
import com.jpa.domain.User;
import com.jpa.domain.UserDomainRepo;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class QueryDSLController2 {

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


    @RequestMapping("/singleValue")
    public List<String> singleValue() {
        QUser qUser = QUser.user;
        List<String> names = queryFactory.select(qUser.name).from(qUser).where(qUser.id.eq(1))
                //分组
                .groupBy(qUser.name)
                //排序
                .orderBy(qUser.id.desc())
                .fetch();
        /**
         * 单值查询
         */
        return names;
    }

    @RequestMapping("/delete2")
    @Transactional
    public Long delete() {
        QUser qUser = QUser.user;
        long execute = queryFactory.delete(qUser).where(qUser.id.eq(2)).execute();

        return execute;
    }

    @RequestMapping("/update2")
    @Transactional
    public Long update2() {
        QUser qUser = QUser.user;
        long execute = queryFactory.update(qUser).where(qUser.id.eq(3))
                .set(qUser.name, "zhouyue")
                .set(qUser.address, "安徽")
                .execute();

        return execute;
    }


    @RequestMapping("/page")
    public Map<String, Object> page() {
        Predicate predicate = QUser.user.id.lt(10);
        Sort sort = new Sort(new Sort.Order(Sort.Direction.DESC, "id"));
        PageRequest pageRequest = new PageRequest(0, 5, sort);
        Page<User> page = userDomainRepo.findAll(predicate, pageRequest);

        long totalElements = page.getTotalElements();
        List<User> content = page.getContent();

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("totalCount", totalElements);
        resultMap.put("users", content);

        return resultMap;
    }


}
