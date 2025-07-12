package com.fullcycle.admin.catalogo.application;

import com.fullcycle.admin.catalog.domain.category.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CategoryUseCaseTest {

    @Test
    void testExecute() {
        // Given
        CategoryUseCase useCase = new CategoryUseCase();

        // When
        Category category = useCase.execute();

        // Then
        assertNotNull(category);
    }
}