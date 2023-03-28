package com.example.LMS.service;
import com.example.LMS.model.IssueBookModel;
import com.example.LMS.repository.IssueBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class IssueBookService {
    @Autowired
    private IssueBookRepo issueBookRepo;
    public IssueBookModel issueBook (IssueBookModel issueBookModel)
    {
        return issueBookModel.assemble(issueBookRepo.save(issueBookModel.disassemble()));
    }
}
