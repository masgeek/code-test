package com.munywele.arrays;

import java.util.*;

public class MoveZero {
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
