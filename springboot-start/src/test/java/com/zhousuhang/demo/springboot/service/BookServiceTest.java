package com.zhousuhang.demo.springboot.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BookServiceTest {
	
	@Autowired
    private BookService bookService;

	@Before
    public void setUp() {
		bookService.deleteAllBooks();
    }
	
	@Test
    public void test() throws Exception {
		bookService.create("a", "a");
		bookService.create("b", "b");
		bookService.create("c", "c");
		bookService.create("d", "d");
		bookService.create("e", "e");

        Assert.assertEquals(5, bookService.getBooksCount().intValue());

        bookService.deleteByName("a");
        bookService.deleteByName("e");

        Assert.assertEquals(3, bookService.getBooksCount().intValue());

    }
}
