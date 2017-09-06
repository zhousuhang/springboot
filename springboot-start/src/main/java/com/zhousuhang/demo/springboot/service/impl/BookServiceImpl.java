package com.zhousuhang.demo.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.zhousuhang.demo.springboot.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Override
	public void create(String name, String author) {
		jdbcTemplate.update("insert into book(name, author) values(?, ?)", name, author);
	}

	@Override
	public void deleteByName(String name) {
		jdbcTemplate.update("delete from book where name = ?", name);
	}

	@Override
	public Integer getBooksCount() {
		return jdbcTemplate.queryForObject("select count(1) from book", Integer.class);
	}

	@Override
	public void deleteAllBooks() {
		jdbcTemplate.update("delete from book");
	}

}
