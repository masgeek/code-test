package com.munywele.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordTest {

    ReverseWord reverseWord;
    @BeforeEach
    void setUp() {
        reverseWord = new ReverseWord();
    }

    @Test
    void reverse_word(){
        char[] theWord = "Hello world.".toCharArray();
        String result = reverseWord.reverseWord(theWord);
        assertEquals("world. Hello",result);
    }

    @Test
    void reverse_word_b(){
        char[] theWord = "The quick brown fox jumped over the lazy dog.".toCharArray();
        String result = reverseWord.reverseWord(theWord);
        assertEquals("dog. lazy the over jumped fox brown quick The",result);
    }
}