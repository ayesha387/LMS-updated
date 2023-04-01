package com.example.LMS.controller;

import com.example.LMS.entity.BookShelf;
import com.example.LMS.model.BookShelfModel;
import com.example.LMS.model.MemberModel;
import com.example.LMS.service.BookShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookshelves")
public class BookShelfController {
    private final BookShelfService bookShelfService;

    public BookShelfController(BookShelfService bookShelfService) {
        this.bookShelfService = bookShelfService;
    }

    @PostMapping("/{shelfId}/books/{bookId}")
    public BookShelf addBookToShelf(@PathVariable Long shelfId, @PathVariable Long bookId) {
        return bookShelfService.addBookToShelf(shelfId, bookId);
    }

    @DeleteMapping("/{shelfId}/books/{bookId}")
    public void removeBookFromShelf(@PathVariable Long shelfId, @PathVariable Long bookId) {
        bookShelfService.removeBookFromShelf(shelfId, bookId);
    }
}
