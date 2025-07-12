package com.fullcycle.admin.catalog.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {
    @Test
    public void testCategoryCreation() {
        Category category = new Category();
        assertNotNull(category);
    }

}