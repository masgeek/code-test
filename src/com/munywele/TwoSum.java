package com.munywele;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
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
