package com.example.LMS.model;

import com.example.LMS.entity.Book;
import com.example.LMS.entity.Category;
import lombok.Data;
import org.springframework.stereotype.Component;
@Component
@Data
public class BookModel {
    private Long id;
    private String name;
    private String ISBN;
    private String edition;
    private String author;
    private Category category;
    private long shelfId;

    public Book disassemble() {
        Book book =new Book();
        book.setId(id);
        book.setName(name);
        book.setISBN(this.ISBN);
        book.setEdition(this.edition);
        book.setAuthor(this.author);
        book.setCategory(this.category);
        return book;
    }
    public BookModel assemble(Book book) {
        BookModel bookModel = new BookModel();
        bookModel.setId(book.getId());
        bookModel.setName(book.getName());
        bookModel.setISBN(book.getISBN());
        bookModel.setEdition(book.getEdition());
        bookModel.setAuthor(book.getAuthor());
        bookModel.setCategory(book.getCategory());
        return bookModel;
    }
}
