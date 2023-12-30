package com.munywele.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySumTest {
    ArraySum arraySum;

    @BeforeEach
    void setUp() {
        arraySum = new ArraySum();
    }


    @Test
    void determine_array_sum() {
        int[] nums = {5, 7, 1, 2, 8, 4, 3};
        int sumValue = 3;
        boolean hasSumPairs = arraySum.computeArraySum(nums, sumValue);

        assertTrue(hasSumPairs);
    }

    @Test
    void determine_array_sum_b() {
        int[] nums = {1, 3, 4, 5, 7, 14, 15};

        int sumValue = 4;
        boolean hasSumPairs = arraySum.computeArraySum(nums, sumValue);

        assertTrue(hasSumPairs);
    }

    @Test
    void check_stack_operations_returns_8() {
        String operations = "4 5 6 - 7 +";

        int stackValue = arraySum.stackOperations(operations);

        assertEquals(8, stackValue);
    }

    @Test
    void check_stack_operations_returns_7() {
        String operations = "13 DUP 4 POP 5 DUP + DUP + -";

        int stackValue = arraySum.stackOperations(operations);

        assertEquals(7, stackValue);
    }

    @Test
    void check_stack_operations_returns_negative_1() {
        String operations = "5 6 + -";

        int stackValue = arraySum.stackOperations(operations);

        assertEquals(-1, stackValue);
    }
}