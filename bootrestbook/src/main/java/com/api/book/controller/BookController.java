package com.api.book.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.entities.Book;
import com.api.book.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getBooks()
	{
		List<Book> lis=this.bookService.getAllBooks();
		if(lis.size()<=0)
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		return ResponseEntity.of(Optional.of(lis));
	}
	@PostMapping("/books")
	public Book addBooks(@RequestBody Book book)
	{
		return this.bookService.addBooks(book);
	}
	
	//get the book
//	@GetMapping("/books/{id}")
//	public Book getBookById(@PathVariable("id") int id)
//	{
//		return this.bookService.getBookById(id);
//	}
//	
//	//add the book
//	@PostMapping("/books")
//	public Book addBooks(@RequestBody Book book)
//	{
//		return this.bookService.addBooks(book);
//	}
//	
//	//delete book handler
//	@DeleteMapping("/books/{bookid}")
//	public List<Book> deleteBook(@PathVariable("bookid") int bookid)
//	{
//		return this.bookService.deleteBook(bookid);
//	}
//	
//	//update book handler
//	@PutMapping("/books/{bookid}")
//	public List<Book> updateBook(@RequestBody Book book,@PathVariable("bookid") int bookid)
//	{
//		return this.bookService.updateBook(book,bookid);
//	}
	
	
}
