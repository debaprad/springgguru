package com.springguru.spring5web.repository;

import com.springguru.spring5web.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by debasish on 11/26/2017.
 */
public interface BookRepository extends CrudRepository<Book,Long> {
}
