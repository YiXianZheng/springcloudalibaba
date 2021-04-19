package com.zyx.order.controller;

import com.zyx.order.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/save")
    @GlobalTransactional
    public String createOrder() {

        orderService.add();

        int i = 11 / 0;
        String result = restTemplate.getForObject("http://localhost:8094/save", String.class);
        log.error("调用返回：" + result);
        return "success";
    }
}
