package com.munywele.arrays;

import java.util.Arrays;

/**
 * Given an array of integers, return an array of the squares of each integer, sorted in ascending
 * order
 */
public class ArraySquare {
    /**
     * Given an array of integers, return an array of the squares of each integer, sorted in ascending
     * order
     *
     * @param nums an array of integers
     * @return The squared array
     */
    public int[] computeSquare(int[] nums) {
        int[] squaredArr = new int[nums.length];

        for (int x = 0; x < nums.length; x++) {
            int squared = nums[x] * nums[x];
            squaredArr[x] = squared;
        }

        //sort the array
        //@TODO develop merge sort algorithm later
        Arrays.sort(squaredArr); //built in


        return squaredArr;
    }
}
