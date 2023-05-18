package com.ojas.service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.model.Books;
import com.ojas.repository.BooksRepository;

@Service
public class BooksService {
	@Autowired
	BooksRepository booksRepository;

	public void saveOrUpdate(Books books) {
		booksRepository.save(books);    
		
	}

	public void delete(int bookid) {
		booksRepository.deleteById(bookid);  
		
	}

	public Books getBooksById(int bookid) {
		return booksRepository.findById(bookid).get();  
	}

	public List<Books> getAllBooks() {
		List<Books> books = new ArrayList<Books>();  
		booksRepository.findAll().forEach(books1 -> {
			
			Books b=new Books();
			BeanUtils.copyProperties(books1, b);
		books.add(b);
		}
		);  
		return books;  
	} 

}
