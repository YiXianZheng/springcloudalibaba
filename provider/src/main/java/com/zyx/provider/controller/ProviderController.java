package com.zyx.provider.controller;

import com.zyx.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private ProviderService providerService;

    @GetMapping("/index")
    public String hello() {

        return port;
    }

    @GetMapping("/test1")
    public String test1() {
        providerService.test();
        return "test1";
    }

    @GetMapping("/test2")
    public String test2() {
        providerService.test();
        return "test2";
    }
}
