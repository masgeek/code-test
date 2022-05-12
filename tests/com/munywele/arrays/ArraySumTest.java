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
}