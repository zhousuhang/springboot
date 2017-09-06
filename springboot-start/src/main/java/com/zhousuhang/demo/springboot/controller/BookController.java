package com.zhousuhang.demo.springboot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhousuhang.demo.springboot.domain.Book;
import com.zhousuhang.demo.springboot.domain.BookMapper;
import com.zhousuhang.demo.springboot.service.BookService;

@RestController
public class BookController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	BookService bookService;

	@Autowired
	BookMapper bookMapper;

	@RequestMapping("/book/count")
	public String count() {
		bookService.deleteAllBooks();
		bookService.create("a", "a");
		bookService.create("b", "b");
		bookService.create("c", "c");
		bookService.create("d", "d");
		bookService.create("e", "e");
		logger.debug("book count is " + bookService.getBooksCount());
		return "book count is " + bookService.getBooksCount();
	}

	@RequestMapping("/books")
	public List<Book> books() {
		return bookMapper.getAllBooks();
	}
}