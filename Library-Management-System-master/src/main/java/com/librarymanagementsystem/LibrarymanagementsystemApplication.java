package com.librarymanagementsystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

import com.librarymanagementsystem.entity.Author;
import com.librarymanagementsystem.entity.Book;
import com.librarymanagementsystem.entity.Category;
import com.librarymanagementsystem.entity.Users;
import com.librarymanagementsystem.entity.Publisher;
import com.librarymanagementsystem.service.BookService;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class LibrarymanagementsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibrarymanagementsystemApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialCreate(BookService bookService) {
		return (args) -> {

			Book book = new Book("998811", "Test name", "Test serial name", "Test description");
			Author author = new Author("Test author name", "Test description");
			Category category = new Category("Test category name");
			Publisher publisher = new Publisher("Test publisher name");
			Users user = new Users("mahmoudramzy", "password");
			

			book.addAuthors(author);
			book.addCategories(category);
			book.addPublishers(publisher);

			bookService.createBook(book);

			Book book1 = new Book("2231123", "Test name1", "Test serial name1", "Test description1");
			Author author1 = new Author("Test author name1", "Test description1");
			Category category1 = new Category("Test category name1");
			Publisher publisher1 = new Publisher("Test publisher name1");

			book1.addAuthors(author1);
			book1.addCategories(category1);
			book1.addPublishers(publisher1);

			bookService.createBook(book1);

			Book book2 = new Book("991823", "Test name2", "Test serial name2", "Test description2");
			Author author2 = new Author("Test author name2", "Test description2");
			Category category2 = new Category("Test category name2");
			Publisher publisher2 = new Publisher("Test publisher name2");

			book2.addAuthors(author2);
			book2.addCategories(category2);
			book2.addPublishers(publisher2);

			bookService.createBook(book2);

		};
	}
}
