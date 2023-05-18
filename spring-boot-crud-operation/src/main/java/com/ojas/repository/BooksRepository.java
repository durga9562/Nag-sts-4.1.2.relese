package com.ojas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ojas.model.Books;

@Repository
public interface BooksRepository extends CrudRepository<Books, Integer> {

}
