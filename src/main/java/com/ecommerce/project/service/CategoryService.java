package com.ecommerce.project.service;

import com.ecommerce.project.Model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category categor);
    String deleteCategory(Long categoryId);
    Category updateCategory(Category category, Long categoryId);
}
