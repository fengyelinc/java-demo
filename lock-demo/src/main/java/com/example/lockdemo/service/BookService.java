package com.example.lockdemo.service;

import com.example.lockdemo.entity.Book;

public interface BookService {
    Book queryOne(Integer id);

    Integer insert(Book book);

    Integer del(Integer id);

    Integer update(Book book);

}
