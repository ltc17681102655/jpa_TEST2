package com.jpa.controller;

import com.jpa.domain.QIDCard;
import com.jpa.domain.QOrder;
import com.jpa.domain.QOrderItem;
import com.jpa.domain.QPerson;
import com.jpa.dto.PersonIDCardDto;
import com.querydsl.core.Tuple;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @Auther: ltc
 * @Date: 2018/7/19 13:54
 * @Description: 多表操作
 */
@RestController
public class PersonAndIDCardManager {

    @Autowired
    @PersistenceContext
    private EntityManager entityManager;

    private JPAQueryFactory queryFactory;

    @PostConstruct
    public void init() {
        queryFactory = new JPAQueryFactory(entityManager);
    }

    /**
     * Details：多表动态查询
     */
    @RequestMapping("/table-table")
    public void findAllPersonAndIdCard() {
        Predicate predicate = (QPerson.person.id.intValue()).eq(QIDCard.iDCard.person.id.intValue());
        JPAQuery<Tuple> jpaQuery = queryFactory.select(QIDCard.iDCard.idNo, QPerson.person.address, QPerson.person.name)
                .from(QIDCard.iDCard, QPerson.person)
                .where(predicate);
        System.out.println("===========================");
        List<Tuple> fetch = jpaQuery.fetch();
        fetch.stream().forEach(c->
                {
                    System.out.println(c.get(0,Integer.class));
                    System.out.println(c.get(1,String.class));
                    System.out.println(c.get(2,String.class));
                    /**
                     * 或
                     */
                    System.out.println("............============................");
                    String idNo = c.get(QIDCard.iDCard.idNo);
                    String address = c.get(QPerson.person.address);
                    String name = c.get(QPerson.person.name);
                    System.out.println(idNo+"=="+address+"=="+name);
                }
        );

        System.out.println("===========================");

    }



    /**
     * 结果以DTO的方式输出的示例中，在查询结束后，将查询结果手动的转换成了DTO对象，这种方式其实不太优雅，QueryDSL给我们提供了更好的方式
     * Details：方式一：使用Bean投影
     */
    @RequestMapping("/table-table2")
    public List<PersonIDCardDto> findByDTOUseBean() {
        Predicate predicate = (QPerson.person.id.intValue()).eq(QIDCard.iDCard.person.id.intValue());
        return queryFactory.select(
                Projections.bean(PersonIDCardDto.class, QIDCard.iDCard.idNo, QPerson.person.address, QPerson.person.name))
                .from(QIDCard.iDCard, QPerson.person)
                .where(predicate)
                .fetch();
    }


    /**
     * Details：一对多，条件查询
     */
    @RequestMapping("/table-table3")
    public List<Tuple> findOrderAndOrderItemByOrderName(String orderName){
        //添加查询条件
        Predicate predicate = QOrder.order.orderName.eq(orderName);
        JPAQuery<Tuple> jpaQuery = queryFactory.select(QOrder.order, QOrderItem.orderItem)
                .from(QOrder.order, QOrderItem.orderItem)
                .where(QOrderItem.orderItem.order.id.intValue().eq(QOrder.order.id.intValue()), predicate);

        //拿到结果
        return jpaQuery.fetch();
    }

}
