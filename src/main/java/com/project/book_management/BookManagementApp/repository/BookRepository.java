package com.project.book_management.BookManagementApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.book_management.BookManagementApp.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	@Modifying
	@Query(value = "Insert into book (title, author) values (:title, :author)", nativeQuery = true)
	void addBook(@Param("title") String title, @Param("author") String author);
	
	@Query(value = "SELECT LAST_INSERT_ID()", nativeQuery = true)
	Long getLastInsertedId();

}
