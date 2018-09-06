package com.jpa.domain;


import javax.persistence.*;
import java.util.List;

/**
 * 描述：Order实体类
 * @author chhliu
 */
@Entity
@Table(name="ORDER_C")
public class Order {
    @Id
    @GeneratedValue
    @Column(name="ID")
    private Integer id;

    @Column(length=20, name="ORDER_NAME")
    private String orderName;

    @Column(name="COUNT")
    private Integer count;

    @OneToMany(mappedBy = "order",cascade={CascadeType.PERSIST,CascadeType.REMOVE},fetch = FetchType.LAZY)
    private List<OrderItem> orderItems;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}
