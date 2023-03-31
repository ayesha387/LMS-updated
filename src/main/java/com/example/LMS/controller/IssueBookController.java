package com.example.LMS.controller;

import com.example.LMS.model.IssueBookModel;
import com.example.LMS.service.IssueBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IssueBookController {
    @Autowired
    private IssueBookService issueBookService;

    @PostMapping(path = "/saveIssueBook")
    public IssueBookModel saveIssueBook(@RequestBody IssueBookModel issueBookModel){
        return issueBookService.saveIssueBook(issueBookModel);
    }

    @GetMapping(path = "list")
    public List<IssueBookModel> getIssueBook(@RequestParam(name = "IssueBookId",required = false) Long issueBookId)

    {
        return issueBookService.findIssueBook(issueBookId);
    }
    @GetMapping(path = "/id/{issueBookId}")
    public List<IssueBookModel> getIssueBookById(@PathVariable(value = "issueBookId") Long issueBookId)
    {
        return issueBookService.findIssueBook(issueBookId);
    }
}
