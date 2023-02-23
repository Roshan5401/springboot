package com.api.book.service;

import java.util.*;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.dao.BookRepository;
import com.api.book.entities.Book;

@Component
public class BookService {
//private static List<Book> lis=new ArrayList<>();


	@Autowired
	private BookRepository bookRepository;
//	static
//	{
//		lis.add(new Book(1,"JAVA","UPPU"));
//		lis.add(new Book(2,"JAVA","chupu"));
//		
//	}
	//these are done when the input was given by list
//		public Book getBookById(int id)
//		{
//			return lis.stream().filter(e->e.getId()==id).findFirst().get();
//		}
//
//		public Book addBooks(Book book) {
//			lis.add(book);
//			return book;
//		}
//
//		public List<Book> deleteBook(int id) {
//			// TODO Auto-generated method stub
//			lis=lis.stream().filter(e->e.getId()!=id).collect(Collectors.toList());
//			return lis;
//		}
//
//		public List<Book> updateBook(Book book, int id) {
//			// TODO Auto-generated method stub
//			lis=lis.stream().map(b->{
//				if(b.getId()==id)
//				{
//					b.setTitle(book.getTitle());
//				}
//				return b;
//			}).collect(Collectors.toList());
//			return lis;
//		}
	
	//get all books
	public List<Book> getAllBooks()
	{
		List<Book> list=(List<Book>)this.bookRepository.findAll();
		return list;
	}
	
	//add book

	public Book addBooks(Book book) {
		// TODO Auto-generated method stub
		this.bookRepository.save(book);
		return book;
	}
	
}
