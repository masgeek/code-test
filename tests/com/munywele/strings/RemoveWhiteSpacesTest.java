package com.munywele.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveWhiteSpacesTest {

    RemoveWhiteSpaces removeWhiteSpaces;
    @BeforeEach
    void setUp() {
removeWhiteSpaces = new RemoveWhiteSpaces();
    }

    @Test
    void remove_white_spaces() {
        char[] str = "All greek to me. ".toCharArray();
        String result = removeWhiteSpaces.removeWhiteSpaces(str);
        assertEquals("Allgreektome.",result);
    }
}