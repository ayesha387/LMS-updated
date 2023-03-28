package com.example.LMS.entity;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "book")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "ISBN", unique = true)
    private String ISBN;
    @Column(name = "edition")
    private String edition;
    @Column(name = "author")
    private Integer author;
    @ManyToOne
    @JoinColumn(name = "shelf_id")
    private Shelf shelf;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @OneToOne(mappedBy = "book")
    private IssueBook issueBook;
}
