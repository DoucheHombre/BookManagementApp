package com.project.book_management.BookManagementApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.book_management.BookManagementApp.model.Book;

@Service
public class BookService {
	static List<Book> bookList = new ArrayList<Book>();
	static {
		bookList.add(new Book(1L, "Harry Potter","J.K. Rowling"));
		bookList.add(new Book(1L, "The Hobbit","J R R Tolkein"));
	}
	
	public List<Book> getBooks() {
		return bookList;
	}
}
