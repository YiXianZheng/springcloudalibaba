package com.zyx.order.service.impl;

import com.zyx.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add() {

        jdbcTemplate.batchUpdate("insert into tb_order (id, name) values (3, '测试商品');");
    }
}
