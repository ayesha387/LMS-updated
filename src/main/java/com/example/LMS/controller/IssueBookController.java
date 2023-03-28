package com.example.LMS.controller;

import com.example.LMS.model.IssueBookModel;
import com.example.LMS.service.IssueBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class IssueBookController {
    @Autowired
    private IssueBookService issueBookService;
    @PostMapping("/saveIssueBook")
    public IssueBookModel saveIssueBook(@RequestBody IssueBookModel issueBookModel){
        return issueBookService.issueBook(issueBookModel);
    }
}
