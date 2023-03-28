package com.example.LMS.service;
import com.example.LMS.model.BookModel;
import com.example.LMS.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;

    public BookModel book(BookModel bookModel) {
        bookRepo.save(bookModel.disassemble());
        return bookModel.assemble(bookRepo.save(bookModel.disassemble()));
    }
}
