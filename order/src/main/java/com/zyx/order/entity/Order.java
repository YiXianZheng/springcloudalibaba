package com.zyx.order.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {


    private Integer id;

    private String name;

    public Order(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Order() {

    }
}
