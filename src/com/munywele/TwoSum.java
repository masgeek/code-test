package com.munywele;

import java.util.HashSet;

public class TwoSum {
    public int[] computeSum(int[] nums, int target, int c) {

        int len = nums.length - 1;
        for (int x = 0; x <= len; x++) {
            for (int y = 0; y <= len; y++) {
                if (nums[x] + nums[y] == target) {
                    return new int[]{x, y};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public int[] computeSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int tempSum;

        while (left < right) {
            tempSum = nums[left] + nums[right];
            if (tempSum == target) {
                return new int[]{left, right};
            }

            if (tempSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
