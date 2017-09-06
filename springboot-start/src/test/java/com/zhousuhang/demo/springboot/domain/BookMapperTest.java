package com.zhousuhang.demo.springboot.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BookMapperTest {
	@Autowired
	private BookMapper bookMapper;

	@Before
	public void setUp() {
		bookMapper.deleteAll();
	}

	@Test
	@Rollback
	public void test() {
		bookMapper.insert("a", "a");
		bookMapper.insert("b", "b");
		bookMapper.insert("c", "c");
		bookMapper.insert("d", "d");
		bookMapper.insert("e", "e");
		bookMapper.insert("f", "f");

		Assert.assertEquals("a", bookMapper.findByName("a").getAuthor());
		Assert.assertEquals("b", bookMapper.findByName("b").getAuthor());
		Assert.assertEquals(6, bookMapper.getAllBooks().size());
		Assert.assertEquals("b", bookMapper.findById(bookMapper.findByName("b").getId()).getAuthor());
	}
}
