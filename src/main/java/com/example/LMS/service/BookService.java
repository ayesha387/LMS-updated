package com.example.LMS.service;
import com.example.LMS.entity.Book;
import com.example.LMS.model.BookModel;
import com.example.LMS.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }
    public Book getBookById(Long id) {
        return bookRepo.findById(id).orElse(null);
    }
    public Book saveBook(Book book) {
        return bookRepo.save(book);
    }
    public void deleteBook(Long id) {
        bookRepo.deleteById(id);
    }
}
