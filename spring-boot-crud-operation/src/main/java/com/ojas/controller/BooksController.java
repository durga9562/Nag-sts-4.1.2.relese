package com.ojas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.model.Books;
import com.ojas.service.BooksService;

@RestController

public class BooksController {
	@Autowired
	private BooksService booksService;
	
	

	//@RequestMapping(value="/books",method=RequestMethod.POST)
	private int saveBook(@RequestBody Books books)   
	{  
	booksService.saveOrUpdate(books);  
	return books.getBookid();  
	}  
	 
	
	@GetMapping("/data")
	private List<Books> getAllBooks()   
	{  
	return booksService.getAllBooks();  
	}  
	
	@GetMapping("/book/{bookid}")  
	private Books getBooks(@PathVariable("bookid") int bookid)   
	{  
	return booksService.getBooksById(bookid);  
	}  
	 
	
	@DeleteMapping("/book/{bookid}")  
	private void deleteBook(@PathVariable("bookid") int bookid)   
	{  
	booksService.delete(bookid);  
	}  

	
	
	
	
	@PutMapping("/books")  
	private Books update(@RequestBody Books books)   
	{  
	booksService.saveOrUpdate(books);  
	return books;  

}
}
