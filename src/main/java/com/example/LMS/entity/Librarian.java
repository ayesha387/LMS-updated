package com.example.LMS.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "librarian")
@Data
public class Librarian {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name ="name" )
    private String name;
    @OneToMany(mappedBy = "librarian")
    private List<IssueBook> issueBookList;
}
