package com.example.lockdemo.mapper;

import com.example.lockdemo.entity.Book;
import com.example.lockdemo.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface BookMapper {
//    @Select("select * from book where id=#{id}")
    Book queryOne(Integer id);

    Integer insert(Book book);

    Integer del(Integer id);

    Integer update(Book book);
}
