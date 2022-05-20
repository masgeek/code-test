package com.munywele.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {

    AnagramChecker anagramChecker;
    @BeforeEach
    void setUp() {
        anagramChecker  =new AnagramChecker();
    }

    @Test
    void is_valid_anagram() {
        boolean result = anagramChecker.isAnagram("aacc","ccac");
        assertFalse(result);
    }


    @Test
    void is_valid_anagram_b() {
        boolean result = anagramChecker.isAnagram("rat","car");
        assertFalse(result);
    }

    @Test
    void is_valid_anagram_c() {
        boolean result = anagramChecker.isAnagram("anagram","nagaram");
        assertTrue(result);
    }
}