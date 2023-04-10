package com.example.LMS.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;
@Entity
@Table(name = "book_id")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "id")
    private String name;
    @Column(name = "ISBN", unique = true)
    private String ISBN;
    @Column(name = "edition")
    private String edition;
    @Column(name = "author")
    private String author;



    @ManyToOne
    @JoinColumn(name = "bookshelf")
    private BookShelf bookShelf;


    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @OneToOne(mappedBy = "book")
    private IssueBook issueBook;

}
