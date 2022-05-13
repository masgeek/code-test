package com.munywele.backtracking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BalancedParenthesesTest {

    BalancedParentheses balanced;

    @BeforeEach
    void setUp() {
        balanced = new BalancedParentheses();
    }

    @Test
    void generate_balanced_combinations() {
        ArrayList<String> result = balanced.generateCombinations(3);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("{{{}}}");
        expected.add("{{}{}}");
        expected.add("{{}}{}");
        expected.add("{}{{}}");
        expected.add("{}{}{}");

        assertEquals(Arrays.toString(expected.toArray()), Arrays.toString(result.toArray()));
    }

    @Test
    void generate_balanced_combinations_b() {
        ArrayList<String> result = balanced.generateCombinations(0);
        ArrayList<String> expected = new ArrayList<String>();

        assertEquals(Arrays.toString(expected.toArray()), Arrays.toString(result.toArray()));
    }
}