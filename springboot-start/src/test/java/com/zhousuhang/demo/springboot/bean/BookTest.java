package com.zhousuhang.demo.springboot.bean;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BookTest {
	@Autowired
	private Book book;

	@Test
	public void test() {
		Assert.assertEquals(book.getBookName(), "Spring Boot Start");
		Assert.assertEquals(book.getAuthor(), "Spring");
		Assert.assertEquals(book.getIsbn(), "78709872449");
		Assert.assertEquals(book.getId(), 1);
	}
}
