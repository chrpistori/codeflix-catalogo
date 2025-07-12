package com.fullcycle.admin.catalog.infrastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testMain() {
        Main.main(new String[]{});
        Assertions.assertNotNull(Main.class);
    }
}