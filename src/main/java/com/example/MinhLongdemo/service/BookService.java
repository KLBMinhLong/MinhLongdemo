package com.example.MinhLongdemo.service;

import org.springframework.stereotype.Service;

import com.example.MinhLongdemo.model.Book;

import java.util.*;

@Service
public class BookService {
    private List<Book> books = new ArrayList<>();
    private int nextId = 1;
    public List<Book> getAllBooks() {
        return books;
    }
    public Optional<Book> getBookById(int id) {
        return books.stream().filter(book -> book.getId() == id).findFirst();
    }
    public void addBook(Book book) {
        book.setId(nextId++);
        books.add(book);
    }
    public void deleteBook(int id) {
        books.removeIf(book -> book.getId() == id);
    }
    public void updateBook(Book updatedBook) {
        books.stream()
            .filter(book -> book.getId() == updatedBook.getId())
            .findFirst()
            .ifPresent(book -> {
                book.setTitle(updatedBook.getTitle());
                book.setAuthor(updatedBook.getAuthor());
            });
    }
}
