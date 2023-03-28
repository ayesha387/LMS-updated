package com.example.LMS.model;

import com.example.LMS.entity.Category;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class CategoryModel {

    private String name;

    public Category disassemble() {
        Category category = new Category();
        category.setName(name);
        return category;
    }
    public CategoryModel assemble(Category category) {
        CategoryModel categoryModel = new CategoryModel();
        categoryModel.setName(category.getName());
        return categoryModel;
    }
}

