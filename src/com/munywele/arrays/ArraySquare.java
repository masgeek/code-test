package com.munywele.arrays;

public class ArraySquare {
    public int[] computeSquare(int[] nums) {
        int[] squaredArr = new int[nums.length];

        for (int x = 0; x < nums.length; x++) {
            int squared = nums[x] * nums[x];
            squaredArr[x] = squared;
        }
        return squaredArr;
    }
}
