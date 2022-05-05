package com.munywele;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    TwoSum twoSum;

    @BeforeEach
    void setUp() {
        twoSum = new TwoSum();
    }


    @Test
    void sum_test_1() {
//        int[] nums = {2, 11, 15,7};
        int[] nums = {1, 4, 11, 5, 12, 8, 10};
        int target = 19;

        int[] result = twoSum.computeSum(nums, target,nums.length);

        System.out.print(Arrays.toString(result));
        assertArrayEquals(new int[]{2, 5}, result);
    }

    @Test
    void sum_test_2() {
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] result = twoSum.computeSum(nums, target,nums.length);

        System.out.print(Arrays.toString(result));
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void sum_test_3() {
        int[] nums = {3, 2, 4};
        int target = 5;

        int[] result = twoSum.computeSum(nums, target, nums.length);

        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{0, 1}, result);
    }
}