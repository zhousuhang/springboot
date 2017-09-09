package com.zhousuhang.demo.springboot.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zhousuhang.demo.springboot.client.fallback.ServiceHiClientFallback;

@FeignClient(value = "service-hi", fallback = ServiceHiClientFallback.class)
public interface ServiceHiClient {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}