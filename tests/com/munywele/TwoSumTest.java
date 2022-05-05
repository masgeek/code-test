package com.munywele;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
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
        int[] nums = {1 , 4 , 5 , 11 , 12,8};
        int target = 20;

        int[] result = twoSum.computeSum(nums, target);

        System.out.print(Arrays.toString(result));
        assertArrayEquals(new int[]{4, 5}, result);
    }
}