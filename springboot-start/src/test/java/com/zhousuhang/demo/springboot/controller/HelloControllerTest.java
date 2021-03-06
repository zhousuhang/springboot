package com.zhousuhang.demo.springboot.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootConfiguration
@WebAppConfiguration
public class HelloControllerTest {

	private MockMvc mvc;

	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
	}

	@Test
	public void test() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Hello Spring Boot."))
				.andDo(MockMvcResultHandlers.print()).andReturn();
	}
	
	
//	static imports: MockMvcRequestBuilders.*, MockMvcResultMatchers.*
//
//	 mockMvc.perform(get("/person/1"))
//	   .andExpect(status().isOk())
//	   .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//	   .andExpect(jsonPath("$.person.name").value("Jason"));
//
//	 mockMvc.perform(post("/form"))
//	   .andExpect(status().isOk())
//	   .andExpect(redirectedUrl("/person/1"))
//	   .andExpect(model().size(1))
//	   .andExpect(model().attributeExists("person"))
//	   .andExpect(flash().attributeCount(1))
//	   .andExpect(flash().attribute("message", "success!"));

}