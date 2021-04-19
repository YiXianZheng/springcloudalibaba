package com.zyx.pay.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pay {

    private Integer id;

    private String name;

    public Pay(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Pay() {}
}
