package com.fullcycle.admin.catalog.infrastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testMain() {
        // Given
        String[] args = {};

        // When
        Main.main(args);

        // Then
        Assertions.assertTrue(true, "Main method executed successfully");
    }
}