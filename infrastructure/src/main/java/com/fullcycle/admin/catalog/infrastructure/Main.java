package com.fullcycle.admin.catalog.infrastructure;

import com.fullcycle.admin.catalog.domain.Category;
import com.fullcycle.admin.catalogo.application.CategoryUseCase;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Full Cycle Admin Catalog!");
        Category category = new CategoryUseCase().execute();

        System.out.println("Category created: " + category);
    }
}