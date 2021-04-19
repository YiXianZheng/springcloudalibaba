package com.zyx.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class ConsumerController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/instances")
    public List<ServiceInstance> instances() {

        return discoveryClient.getInstances("provider");
    }

    @GetMapping("/index")
    public String index() {

        List<ServiceInstance> provider = discoveryClient.getInstances("provider");
        int index = ThreadLocalRandom.current().nextInt(provider.size());
        String url = provider.get(index).getUri() + "/index";
        return "consumer随机远程调用 provier："+ restTemplate.getForObject(url, String.class);
    }

    @GetMapping("/index1")
    public String index1() {

        return "consumer随机远程调用 provier："+ restTemplate.getForObject("http://provider/index", String.class);
    }
}
