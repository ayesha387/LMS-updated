package com.example.LMS.service;
import com.example.LMS.entity.Book;
import com.example.LMS.entity.BookShelf;
import com.example.LMS.entity.Shelf;
import com.example.LMS.model.BookModel;
import com.example.LMS.repository.BookRepo;
import com.example.LMS.repository.BookShelfRepo;
import com.example.LMS.repository.ShelfRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;
    @Autowired
    private BookShelfRepo bookShelfRepo;
    @Autowired
    private ShelfRepo shelfRepo;
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }
    public Book getBookById(Long id) {
        return bookRepo.findById(id).orElse(null);
    }
    public Book saveBook(BookModel bookModel) {
        Book book = bookRepo.save(bookModel.disassemble());
        BookShelf bookShelf=new BookShelf();
        bookShelf.setBook(book);
        bookShelfRepo.save(bookShelf);
        long shelfId= bookModel.getShelfId();
        Shelf shelf = new Shelf();
        shelf.setId(bookModel.getShelfId());
        bookShelfRepo.save(bookShelf);




        return null /*bookModel.assemble(bookRepo.save(bookModel.disassemble())).disassemble()*/;
    }
    public void deleteBook(Long id) {
        bookRepo.deleteById(id);
    }
}
