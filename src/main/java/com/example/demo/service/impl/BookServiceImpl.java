package com.example.demo.service.impl;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    private BookRepository bookDao;

    @Autowired
    public BookServiceImpl(BookRepository bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public Book save(Book book) {
        return bookDao.save(book);
    }

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }
}
