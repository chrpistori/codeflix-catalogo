package com.fullcycle.admin.catalogo.application;

import com.fullcycle.admin.catalog.domain.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CategoryUseCaseTest {

    @Test
    void testExecute() {
        // When
        Category category = CategoryUseCase.execute();

        // Then
        assertNotNull(category);
    }
}