package com.munywele.arrays;

import java.util.*;

/**
 * I'm using a map to store the zeroes and their index, then I'm using a new array to store the zeroes
 * first, then I'm merging the old array with the new array
 */
public class MoveZero {
    /**
     * I'm using a map to store the zeroes and their index, then I'm using a new array to store the
     * zeroes first, then I'm merging the old array with the new array
     * 
     * @param nums the array of integers
     * @return The method is returning the new array with the zeroes moved to the left.
     */
    public int[] moveZeroToLeft(int[] nums) {
        Map<Integer, Integer> myZeroes = new HashMap<>();
        int[] newArray = new int[nums.length];
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] == 0) {
                myZeroes.put(x, nums[x]);
            }
        }

        int newIndex = 0;
        for (Map.Entry<Integer, Integer> theZero : myZeroes.entrySet()) {
            newArray[newIndex] = theZero.getValue();
            newIndex++;
        }

        //next merge with the old array
        int startIndex = myZeroes.size();
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] != 0) {
                newArray[startIndex] = nums[x];
                startIndex++;
            }
        }
        nums = newArray;
        return nums;
    }
}
