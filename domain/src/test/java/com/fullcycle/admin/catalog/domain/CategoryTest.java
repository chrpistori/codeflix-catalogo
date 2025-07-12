package com.fullcycle.admin.catalog.domain;

import com.fullcycle.admin.catalog.domain.category.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {
    @Test
    public void givenValidParams_whenCallNewCategory_thenInstantiateCategory() {
        final var expectedName = "Movies";
        final var expectedDescription = "Action and adventure movies";
        final var expectedIsActive = true;

        final var activeCategory = Category.newCategory(expectedName, expectedDescription, expectedIsActive);

        assertNotNull(activeCategory);
        assertNotNull(activeCategory.getId());
        assertEquals(expectedName, activeCategory.getName());
        assertEquals(expectedDescription, activeCategory.getDescription());
        assertEquals(expectedIsActive, activeCategory.isActive());
        assertNotNull(activeCategory.getCreatedAt());
        assertNotNull(activeCategory.getUpdatedAt());
        assertNull(activeCategory.getDeletedAt());
    }

}