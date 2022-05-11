package com.munywele;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowHighIndexTest {

    LowHighIndex lowHighIndex;

    @BeforeEach
    void setUp() {
        lowHighIndex = new LowHighIndex();
    }

    @Test
    void find_high_and_low_index_brute() {
        int[] nums = {1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6};
        int target = 5;

        int lowIndex = lowHighIndex.findLowIndexBruteForce(nums, target);
        int highIndex = lowHighIndex.findHighIndexBruteForce(nums, target);

        assertEquals(15, lowIndex);
        assertEquals(17, highIndex);
    }

    @Test
    void find_high_and_low_index_brute_2() {
        int[] nums = {1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6, 9};
        int target = 9;

        int lowIndex = lowHighIndex.findLowIndexBruteForce(nums, target);
        int highIndex = lowHighIndex.findHighIndexBruteForce(nums, target);

        assertEquals(24, lowIndex);
        assertEquals(24, highIndex);
    }
}