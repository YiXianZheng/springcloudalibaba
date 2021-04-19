package com.zyx.provider.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProviderService {

    @SentinelResource("test")
    public void test() {

        log.error("--------test--------");
    }
}
