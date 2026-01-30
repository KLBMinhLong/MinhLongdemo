package com.example.MinhLongdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.MinhLongdemo.model.Book;
import com.example.MinhLongdemo.service.BookService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookService BookService;
    @GetMapping
    public List<Book> getAllBooks() {
        return BookService.getAllBooks();
    }
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id) {
        return BookService.getBookById(id);
    }
    @PostMapping
    public String addBook(@RequestBody Book book) {
        BookService.addBook(book);
        return "Book added successfully";
    }
    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id) {
        BookService.deleteBook(id);
        return "Book deleted successfully";
    }
    @PutMapping("/{id}")
    public String updateBook(@PathVariable int id, @RequestBody Book book) {
        BookService.updateBook(id, book);
        return "Book updated successfully";
    }
}
