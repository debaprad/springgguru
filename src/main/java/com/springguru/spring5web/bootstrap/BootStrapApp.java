package com.springguru.spring5web.bootstrap;

import com.springguru.spring5web.model.Author;
import com.springguru.spring5web.model.Book;
import com.springguru.spring5web.model.Publisher;
import com.springguru.spring5web.repository.AuthorRepository;
import com.springguru.spring5web.repository.BookRepository;
import com.springguru.spring5web.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by debasish on 11/26/2017.
 */
@Component
public class BootStrapApp implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    PublisherRepository publisherRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    public void initData()
    {
        Author author1=new Author("debasisha","pradhan");
        Author author2=new Author("ishani","das");
        Author author3=new Author("jigu","parida");

        Publisher publisher1=new Publisher("deba productions","chennai");
        Publisher publisher2=new Publisher("ishu productions","Bangalore");
        Publisher publisher3=new Publisher("jigu productions","bam");

        publisherRepository.save(publisher1);
        publisherRepository.save(publisher2);
        publisherRepository.save(publisher3);


        Book book1=new Book("Java8","12766723ISBN",publisher1);
        Book book2=new Book("Spring boot","78787878ISBN",publisher2);
        Book book3=new Book("Spring Microservices","989898ISBN",publisher3);


        author1.addBooks(book1);
        author1.addBooks(book3);

        author2.addBooks(book3);
        author2.addBooks(book2);

        author3.addBooks(book1);
        author3.addBooks(book2);

       /* book1.addAuthors(author1);
        book1.addAuthors(author3);

        book2.addAuthors(author2);
        book2.addAuthors(author3);


        book3.addAuthors(author1);
        book3.addAuthors(author2);*/


        authorRepository.save(author1);
        authorRepository.save(author2);
        authorRepository.save(author3);

        bookRepository.save(book1);
        bookRepository.save(book2);
        bookRepository.save(book3);

    }
}
