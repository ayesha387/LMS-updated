package com.example.LMS.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
@Entity
@Table(name = "IssueBook")
@Data
public class IssueBook {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "country_id_seq")
    @GenericGenerator(name = "country_id_seq", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {@org.hibernate.annotations.Parameter(name = "increment_size",value = "1")})
    @Column(name = "id")
    private Long id;
    @Column(name="issue_date")
    private Date issueDate;
    @Column(name="return_date")
    private Date returnDate;

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





