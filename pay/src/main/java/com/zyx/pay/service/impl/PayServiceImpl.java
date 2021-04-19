package com.zyx.pay.service.impl;

import com.zyx.pay.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl implements PayService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add() {

        jdbcTemplate.batchUpdate("insert into pay (id, name) values (1, '测试订单');");
    }
}
