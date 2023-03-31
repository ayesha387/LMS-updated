package com.example.LMS.service;
import com.example.LMS.entity.IssueBook;
import com.example.LMS.model.IssueBookModel;
import com.example.LMS.repository.IssueBookRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class IssueBookService {
    @Autowired
    private IssueBookRepo issueBookRepo;
    @Transactional
    public IssueBookModel saveIssueBook (IssueBookModel issueBookModel)
    {
        IssueBook issueBook = null;
        if(!ObjectUtils.isEmpty(issueBookModel))
        {
            issueBook = findExistingIssueBook(issueBookModel);
            if(ObjectUtils.isEmpty(issueBook))
            {
                issueBook = issueBookModel.disassemble();
            }
            else
            {
                issueBook.setId(issueBookModel.getIssueBookId());
            }
        }
        return new IssueBookModel(issueBookRepo.save(issueBook));
    }

    private IssueBook findExistingIssueBook(IssueBookModel issueBookModel) {

        return new IssueBook();
    }

    public List<IssueBookModel> findIssueBook(Long issueBookId)
    {
        List<IssueBookModel> issueBookModels = new ArrayList<>();
        if(issueBookId != null)
        {
            issueBookModels = List.of(issueBookRepo.findAll()
                    .stream()
                    .map(IssueBookModel::new)
                    .filter(issueBookModel -> issueBookModel.getIssueBookId().equals(issueBookId))
                    .findFirst()
                    .get());
        }

        else if(issueBookId != null)
        {
            issueBookModels = List.of(issueBookRepo.findAll()
                    .stream()
                    .map(IssueBookModel::new)
                    .filter(issueBookModel -> issueBookModel.getClass().equals(issueBookId))
                    .findFirst()
                    .get());

        }
        else
        {
            issueBookModels = issueBookRepo.findAll()
                    .stream()
                    .map(IssueBookModel::new)
                    .collect(Collectors.toList());
        }
        return issueBookModels;
    }


    private IssueBook findExistingCountry(IssueBookModel issueBookModel)
    {
        IssueBook issueBook = null;
        if(!ObjectUtils.isEmpty(issueBookModel.getIssueBookId()))
        {
            issueBook = issueBookRepo.findIssueBookById(issueBookModel.getIssueBookId());
        }
        else if (!StringUtils.isEmpty(issueBookModel.getIssueBookId()))
        {
            issueBook = issueBookRepo.findIssueBookById(issueBookModel.getIssueBookId());
        }
        return issueBook;
    }

}
