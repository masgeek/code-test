package com.munywele.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class StringSegmentationTest {

    StringSegmentation stringSegmentation;

    @BeforeEach
    void setUp() {
        stringSegmentation = new StringSegmentation();
    }

    @Test
    void can_segment_string() {
        Set<String> dictionary = new HashSet<>();
        dictionary.add("apple");
        dictionary.add("pear");
        dictionary.add("pier");
        dictionary.add("pie");

        boolean outcome = stringSegmentation.canSegmentString("applepie", dictionary);
        assertTrue(outcome);
    }
}