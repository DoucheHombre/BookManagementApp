package com.project.book_management.BookManagementApp.dto;

import jakarta.validation.constraints.NotBlank;

public class BookDTO {
	@NotBlank
	private String title;
	@NotBlank
	private String author;

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
