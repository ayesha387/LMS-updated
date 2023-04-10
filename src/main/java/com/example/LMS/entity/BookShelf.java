package com.example.LMS.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "book_shelf")
@Data
public class BookShelf {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @OneToMany(mappedBy = "bookShelf")
    private List<Book> bookList;



    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
}
