package com.munywele.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {

    StringCompression stringCompression;
    @BeforeEach
    void setUp() {
        stringCompression = new StringCompression();
    }

    @Test
    void compress_first_string(){
        String result = stringCompression.compressString("aabcccccaaa");

        assertEquals("a2b1c5a3",result);
    }

    @Test
    void compress_first_string_b(){
        String result = stringCompression.compressString("aaaaaabcccddeeff");

        assertEquals("a6b1c3d2e2f2",result);
    }
}