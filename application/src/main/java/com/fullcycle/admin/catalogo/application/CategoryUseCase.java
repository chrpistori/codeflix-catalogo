package com.fullcycle.admin.catalogo.application;

import com.fullcycle.admin.catalog.domain.Category;

public class CategoryUseCase {
    public static Category execute() {
        System.out.println("Creating a new category... Please wait.");
        Category category = new Category();

        System.out.println("Category created successfully: " + category);
        return category;
    }
}
