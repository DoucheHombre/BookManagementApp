package com.project.book_management.BookManagementApp.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.book_management.BookManagementApp.dto.BookDTO;
import com.project.book_management.BookManagementApp.model.Book;
import com.project.book_management.BookManagementApp.service.BookService;

import jakarta.validation.Valid;

@RestController
public class BookController {

	private final BookService bookService;

	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	@PostMapping("/books")
	public ResponseEntity<Book> addBooks(@Valid @RequestBody BookDTO bookDTO) {
		Book savedbook = new Book(bookDTO.getTitle(), bookDTO.getAuthor());
		bookService.addBook(savedbook);
		return new ResponseEntity<Book>(savedbook, HttpStatus.CREATED);
	}
	// GET /books/{id}
	// DELETE /books/{id}
	// PUT /books/{id}

}
