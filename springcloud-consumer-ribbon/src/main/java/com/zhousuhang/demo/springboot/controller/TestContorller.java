package com.zhousuhang.demo.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zhousuhang.demo.springboot.service.HelloService;

@RestController
public class TestContorller {

	@Autowired
	HelloService helloService;

	@RequestMapping("/hi")
	public String home(@RequestParam String name) {
		return helloService.hiService(name);
	}

}
