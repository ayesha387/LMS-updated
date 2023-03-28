package com.example.LMS.model;

import com.example.LMS.entity.IssueBook;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
public class IssueBookModel {
    private Date issueDate;
    private Date retrunDate;

    public IssueBook disassemble() {
        IssueBook issueBook = new IssueBook();
        issueBook.setIssueDate(issueDate);
        issueBook.setReturnDate(retrunDate);
        return issueBook;
    }

    public IssueBookModel assemble(IssueBook issueBook) {
        IssueBookModel issueBookModel = new IssueBookModel();
        issueBookModel.setIssueDate(issueBook.getIssueDate());
        issueBookModel.setRetrunDate(issueBook.getReturnDate());
        return issueBookModel;
    }
}
