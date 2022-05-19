package com.munywele.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoStringTest {

    AddTwoString addTwoString;

    @BeforeEach
    void setUp() {
        addTwoString = new AddTwoString();
    }

    @Test
    void add_strings() {
        String result = addTwoString.addStrings("11", "123");
        assertEquals("134", result);
    }

    @Test
    void convert_to_string() {
        String result = addTwoString.convertNumber(11);
        assertEquals("11", result);
    }
}