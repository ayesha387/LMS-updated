package com.example.LMS.model;
import com.example.LMS.entity.Book;
import com.example.LMS.entity.BookShelf;
import com.example.LMS.entity.Shelf;
import lombok.Data;
@Data
public class BookShelfModel {
    private Long id;
    private Long shelfId;
    private Long bookId;

    public BookShelf disassemble() {
        BookShelf bookshelf = new BookShelf();
        bookshelf.setId(id);
         /*bookshelf.setShelfId(shelfId);
        bookshelf.setBookId(bookId);*/
        return bookshelf;
    }

    public BookShelfModel assemble(BookShelf bookshelf) {
        BookShelfModel bookshelfModel = new BookShelfModel();
        bookshelfModel.setId(bookshelf.getId());
      /*  bookshelfModel.setShelfId(bookshelf.getShelf().getId());
        bookshelfModel.setBookId(bookshelf.getBook().getId());*/
        return bookshelfModel;
    }

}
