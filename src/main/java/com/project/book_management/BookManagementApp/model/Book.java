package com.project.book_management.BookManagementApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue
	private long id;
	private String title;
	private String author;

	// price, isbn, publishedDate, genre

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public Book(long id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
