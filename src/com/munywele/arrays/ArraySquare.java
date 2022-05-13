package com.munywele.arrays;

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

        int left = 0;
        int right = nums.length - 1;

        for (int x = nums.length - 1; x >= 0; x--) {
            int square;

            //get values and make them absolute
            int leftTemp = nums[left];
            int rightTemp = nums[right];
            if (leftTemp < 0) {
                leftTemp = (leftTemp) * (-1);
            }
            if (rightTemp < 0) {
                rightTemp = (rightTemp) * (-1);
            }
            if (leftTemp < rightTemp) {
                square = nums[right];
                right--;
            } else {
                square = nums[left];
                left++;
            }
            squaredArr[x] = square * square;
        }

        //sort the array
        //@TODO develop merge sort algorithm later
        // Arrays.sort(squaredArr); //built in


        return squaredArr;
    }
}
