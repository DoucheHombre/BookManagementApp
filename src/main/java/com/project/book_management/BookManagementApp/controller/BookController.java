package com.project.book_management.BookManagementApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.book_management.BookManagementApp.model.Book;
import com.project.book_management.BookManagementApp.service.BookService;

@RestController
public class BookController {

	private final BookService bookService;

	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}

	@GetMapping("/books")
	public List<Book> getBooks() {
		return bookService.getBooks();
	}

	@PostMapping("/books")
	public void addBooks() {

	}
	// GET /books/{id}
	// DELETE /books/{id}
	// PUT /books/{id}

}
