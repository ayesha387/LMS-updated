package com.example.LMS.model;

import com.example.LMS.entity.IssueBook;
import lombok.Data;
import java.util.Date;
@Data
public class IssueBookModel {
    private Long IssueBookId;

    public IssueBookModel(IssueBook issueBook)
    {
        this.IssueBookId=issueBook.getId();
    }

    public IssueBookModel(Long issueBookId)
    {
        this.IssueBookId = issueBookId;
    }

    public IssueBook disassemble()
    {
        IssueBook npIssueBook = new IssueBook();
        npIssueBook.setId(this.getIssueBookId());
        return npIssueBook;
    }
}
