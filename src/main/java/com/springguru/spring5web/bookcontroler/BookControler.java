package com.springguru.spring5web.bookcontroler;

import com.springguru.spring5web.model.Book;
import com.springguru.spring5web.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by debasish on 11/26/2017.
 */
@RestController
public class BookControler {

    @Autowired
    BookRepository bookRepository;

    @RequestMapping("/books")
    public Iterable<Book> getAllBooks()
    {
         return bookRepository.findAll();
    }
}
