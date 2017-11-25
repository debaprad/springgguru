package com.springguru.spring5web.repository;

import com.springguru.spring5web.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by debasish on 11/26/2017.
 */
public interface AuthorRepository extends CrudRepository<Author,Long>{
}
