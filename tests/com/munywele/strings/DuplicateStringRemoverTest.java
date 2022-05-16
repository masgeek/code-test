package com.munywele.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateStringRemoverTest {
DuplicateStringRemover duplicateStringRemover;
    @BeforeEach
    void setUp() {
        duplicateStringRemover = new DuplicateStringRemover();
    }

    @Test
    void remove_duplicate_string(){
        char[] str = "abbabcddbabcdeedebc".toCharArray();
        String result = duplicateStringRemover.removeDuplicates(str);
        assertEquals("abcde",result);
    }

    @Test
    void remove_duplicate_string_sorted(){
        String str = "cbacdcbc";
        String result = duplicateStringRemover.removeDuplicatesLexicoGraphOrder(str);
        assertEquals("acdb",result);
    }

    @Test
    void remove_duplicate_string_sorted_b(){
        String str = "bcabc";
        String result = duplicateStringRemover.removeDuplicatesLexicoGraphOrder(str);
        assertEquals("abc",result);
    }
}