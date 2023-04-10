package com.example.LMS.model;

import com.example.LMS.entity.IssueBook;
import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
public class IssueBookModel {
    private Long id;
    private LocalDate issueDate;
    private LocalDate returnDate;
    private Long memberId;
    private Long bookId;

    public IssueBookModel() {}

    public IssueBookModel(LocalDate issueDate, LocalDate returnDate, Long memberId, Long bookId) {
        this.issueDate = issueDate;
        this.returnDate = returnDate;
        this.memberId = memberId;
        this.bookId = bookId;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }
}
