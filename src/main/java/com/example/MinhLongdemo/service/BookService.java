package com.example.MinhLongdemo.service;

import org.springframework.stereotype.Service;

import com.example.MinhLongdemo.model.Book;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private List<Book> books = new ArrayList<>();
    public List<Book> getAllBooks() {
        return books;
    }
    public Book getBookById(int id) {
        return books.stream().filter(book -> book.getId() == id).findFirst().orElse(null);
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void deleteBook(int id) {
        books.removeIf(book -> book.getId() == id);
    }
    public void updateBook(int id, Book updatedBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.set(i, updatedBook);
                return;
            }
        }
    }
}
