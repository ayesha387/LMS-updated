package com.example.LMS.model;

import com.example.LMS.entity.Book;
import lombok.Data;
import org.springframework.stereotype.Component;
@Component
@Data
public class BookModel {
    private String ISBN;
    private String category;
    private String edition;
    private int price;
    public Book disassemble() {
        Book book = new Book();
        book.setISBN(ISBN);
        book.setEdition(edition);
        return book;
    }
    public BookModel assemble(Book book) {
        BookModel bookModel = new BookModel();
        bookModel.setISBN(book.getISBN());
        bookModel.setEdition(book.getEdition());
        return bookModel;
    }
}
