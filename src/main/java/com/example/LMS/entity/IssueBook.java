package com.example.LMS.entity;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "IssueBook")
@Data
public class IssueBook {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name="issue_date")
    private String issueDate;
    @Column(name="return_date")
    private String returnDate;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
    @ManyToOne
    @JoinColumn(name = "librarian_id")
    private Librarian librarian;
    @OneToOne
    @JoinColumn(name = "book_id")
    private Book book;
}





