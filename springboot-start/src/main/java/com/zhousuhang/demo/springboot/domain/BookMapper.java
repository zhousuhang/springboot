package com.zhousuhang.demo.springboot.domain;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookMapper {
	
	@Select("select * from book where name = #{name}")
	Book findByName(@Param("name")String name);
	
	@Insert("insert into book(name, author) values(#{name}, #{author})")
	int insert(@Param("name") String name, @Param("author") String author);
	
	@Select("select * from book")
	List<Book> getAllBooks();
	
	@Delete("delete from book")
	void deleteAll();
	
	Book findById(Integer id);
}
