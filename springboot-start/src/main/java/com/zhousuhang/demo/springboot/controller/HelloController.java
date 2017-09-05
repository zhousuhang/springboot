package com.zhousuhang.demo.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/hello")
	public String index() {
		logger.debug("Hello Spring Boot.");
		return "Hello Spring Boot.";
	}
}