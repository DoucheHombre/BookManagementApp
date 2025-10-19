package com.project.book_management.BookManagementApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.book_management.BookManagementApp.model.Book;
import com.project.book_management.BookManagementApp.repository.BookRepository;

import jakarta.transaction.Transactional;

@Service
public class BookService {
//	static List<Book> bookList = new ArrayList<Book>();
//	static {
//		bookList.add(new Book(1L, "Harry Potter","J.K. Rowling"));
//		bookList.add(new Book(1L, "The Hobbit","J R R Tolkein"));
//	}

	public final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}
	
	@Transactional
	public Book addBook(Book book) {
		bookRepository.addBook(book.getTitle(), book.getAuthor());
		Long newId = bookRepository.getLastInsertedId();
	    book.setId(newId);
		return book;
	}
}
