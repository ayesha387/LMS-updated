package com.example.LMS.service;

import com.example.LMS.entity.BookShelf;
import com.example.LMS.model.BookShelfModel;
import com.example.LMS.model.MemberModel;
import com.example.LMS.repository.BookShelfRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookShelfService {
    private final BookShelfRepo bookShelfRepo;

    public BookShelfService(BookShelfRepo bookShelfRepo) {
        this.bookShelfRepo = bookShelfRepo;
    }

    public BookShelf addBookToShelf(Long shelfId, Long bookId) {
        // implementation logic
        return null;
    }

    public void removeBookFromShelf(Long shelfId, Long bookId) {
        // implementation logic
    }
}

