package com.example.lockdemo.service.impl;

import com.example.lockdemo.entity.Book;
import com.example.lockdemo.mapper.BookMapper;
import com.example.lockdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Transactional
    @Override
    public Book queryOne(Integer id) {
        return bookMapper.queryOne(id);
    }

    @Transactional
    @Override
    public Integer insert(Book book) {

        return bookMapper.insert(book);
    }

    @Transactional
    @Override
    public Integer del(Integer id) {

        return bookMapper.del(id);
    }

    @Transactional
    @Override
    public Integer update(Book book) {

        return bookMapper.update(book);
    }
}
