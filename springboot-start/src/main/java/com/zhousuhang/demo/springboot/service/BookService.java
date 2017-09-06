package com.zhousuhang.demo.springboot.service;

public interface BookService {
	void create(String name, String author);

	void deleteByName(String name);

	Integer getBooksCount();

	void deleteAllBooks();
}
