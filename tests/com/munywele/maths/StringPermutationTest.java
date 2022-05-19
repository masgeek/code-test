package com.munywele.maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class StringPermutationTest {

    StringPermutation stringPermutation;

    @BeforeEach
    void setUp() {
        stringPermutation = new StringPermutation();
    }

    @Test
    void permute_string() {
        Set<String> first = new HashSet<>();
        first.add("bad");
        first.add("bda");
        first.add("abd");
        first.add("dab");
        first.add("dba");
        first.add("adb");

        Set<String> second = stringPermutation.permuteString("bad");

        assertEquals(first.size(), second.size());
        assertTrue(first.size() == second.size() && first.containsAll(second) && second.containsAll(first));
    }

    @Test
    void permute_string_b() {
        Set<String> first = new HashSet<>();
        first.add("bad");

        Set<String> second = stringPermutation.permuteString("");

        assertEquals(first.size(), second.size());
        assertTrue(first.size() == second.size() && first.containsAll(second) && second.containsAll(first));
    }

    @Test
    void twoCharacterStringTest() {
        final Set<String> expected = new HashSet<>(Arrays.asList("ab", "ba"));
        final Set<String> actual = stringPermutation.permuteString("ab");
        assertEquals(expected, actual);
    }

    @Test
    void threeCharacterStringTest() {
        final Set<String> expected = new HashSet<>(Arrays.asList("abc", "acb", "bac", "bca",
                "cab", "cba"));
        final Set<String> actual = stringPermutation.permuteString("abc");
        assertEquals(expected, actual);
    }
}