package com.zhousuhang.demo.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zhousuhang.demo.springboot.SchedualServiceHi;

@RestController
public class TestContorller {

	@Autowired
    SchedualServiceHi schedualServiceHi;
	@RequestMapping("/hi")
	public String home(@RequestParam String name) {
		return schedualServiceHi.sayHiFromClientOne(name);
	}

}
