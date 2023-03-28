package com.example.LMS.service;

import com.example.LMS.model.CategoryModel;
import com.example.LMS.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;

    public CategoryModel category (CategoryModel categoryModel) {
        return categoryModel.assemble(categoryRepo.save(categoryModel.disassemble()));
    }
}
