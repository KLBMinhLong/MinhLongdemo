package com.example.MinhLongdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import com.example.MinhLongdemo.model.Book;
import com.example.MinhLongdemo.service.BookService;

@SpringBootApplication
public class MinhLongdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinhLongdemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner initializeBooks(BookService bookService) {
		return args -> {
			bookService.addBook(new Book(1, "Java Programming", "James Gosling"));
			bookService.addBook(new Book(2, "Spring in Action", "Craig Walls"));
			bookService.addBook(new Book(3, "Clean Code", "Robert C. Martin"));
		};
	}

}
