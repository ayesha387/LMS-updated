package com.example.LMS.entity;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "book_shelf")
@Data
public class BookShelf {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
/*    @Column(name = "shelf_id")
    private Long shelfId;*/

 /*   @Column(name = "book_id")
    private Long bookId;*/

    @ManyToOne
    @JoinColumn(name = "shelf_id")
    private Shelf shelf;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
}
