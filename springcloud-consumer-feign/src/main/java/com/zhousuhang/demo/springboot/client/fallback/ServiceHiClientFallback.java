package com.zhousuhang.demo.springboot.client.fallback;

import org.springframework.stereotype.Component;

import com.zhousuhang.demo.springboot.client.ServiceHiClient;

@Component
public class ServiceHiClientFallback implements ServiceHiClient{

	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry "+name;
	}

}
