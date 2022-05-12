package com.munywele.arrays;

/**
 * The class contains two methods that return the index of the first and last occurrence of a target
 * value in an array
 */
public class LowHighIndex {

    /**
     * The function iterates through the array and returns the index of the first encounter of the
     * target value
     * 
     * @param nums the array of integers to search
     * @param target the target value we're looking for
     * @return The index of the first occurrence of the target value.
     */
    public int findLowIndexBruteForce(int[] nums, int target) {

        int len = nums.length - 1;
        int lowIndex = -1;

        for (int x = 0; x <= len; x++) {
            //stop at first encounter
            if (target == nums[x]) {
                lowIndex = x;
                break;
            }
        }
        return lowIndex;
    }

    /**
     * We start at the end of the array and work our way backwards until we find the target
     * 
     * @param nums the array of integers
     * @param target the target value we're looking for
     * @return The index of the last occurrence of the target value in the array.
     */
    public int findHighIndexBruteForce(int[] nums, int target) {
        int len = nums.length - 1;
        int highIndex = -1;
//do it in reverse
        for (int x = len; x >= 0; x--) {
            if (target == nums[x]) {
                highIndex = x;
                break;
            }
    
        }
        return highIndex;
    }
}
