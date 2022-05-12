package com.munywele.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * For each element in the array, check if there is another element that sums to the target
 */
public class TwoSum {
    /**
     * For each element in the array, check if there is another element that sums to the target
     * 
     * @param nums an array of integers
     * @param target the target sum
     * @return The index of the two numbers that add up to the target.
     */
    public int[] computeSum(int[] nums, int target) {

        int len = nums.length - 1;
        for (int x = 0; x <= len; x++) {
            for (int y = x + 1; y <= len; y++) {
                if (nums[x] + nums[y] == target) {
                    return new int[]{x, y};
                }
            }
        }
        return new int[]{-1, -1};
    }

    /**
     * We start with the left and right pointers at the beginning and end of the array, respectively.
     * We then move the right pointer to the left until the sum of the two numbers is equal to the
     * target. If the sum is greater than the target, we move the right pointer to the left. If the sum
     * is less than the target, we move the left pointer to the right
     * 
     * @param nums [1,2,3,4,5,6,7,8,9,10]
     * @param target the target sum
     * @return The indices of the two numbers that add up to the target.
     */
    public int[] computeSumSlide(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int tempSum;

        while (left < nums.length) {
            tempSum = nums[left] + nums[right];

            System.out.println("Sum is " + tempSum + " for index " + left + "," + right);
            if (tempSum == target) {
                return new int[]{left, right};
            }

            if (tempSum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1};
    }

    /**
     * We're going to loop through the array, and for each element, we're going to check if the
     * difference between the target and the current element is in the map. If it is, then we've found
     * the two elements that add up to the target. If not, we'll add the current element to the map
     * 
     * @param nums the array of numbers
     * @param target the target sum
     * @param length the length of the array
     * @return The indices of the two numbers such that they add up to a specific target.
     */
    public int[] computeSum(int[] nums, int target, int length) {
        int[] sumIndex = new int[2];

        Map<Integer, Integer> sumStore = new HashMap<>();
        for (int x = 0; x < length; x++) {
            int theDifference = target - nums[x];
            if (sumStore.containsKey(theDifference)) {
                sumIndex[0] = sumStore.get(theDifference);
                sumIndex[1] = x;
                break;
            }
            sumStore.put(nums[x], x);
        }
        return sumIndex;
    }
}
