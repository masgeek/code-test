package com.munywele.arrays;

import java.util.*;

/**
 * The above class takes an array of integers and a sum value as input and returns true if the sum of
 * any two numbers in the array is equal to the sum value
 */
public class ArraySum {
    /**
     * We are storing the difference between the sum value and the current value in the array as the
     * key and the index of the current value as the value in a hashmap. If the difference is already
     * present in the hashmap, we return true
     *
     * @param nums     an array of integers
     * @param sumValue The sum value that we are trying to find in the array.
     * @return The method returns true if the sum of any two numbers in the array is equal to the
     * sumValue.
     */
    public boolean computeArraySum(int[] nums, int sumValue) {

        Map<Integer, Integer> sumStore = new HashMap<>();

        for (int x = 0; x < nums.length; x++) {
            int diff = sumValue - nums[x];
            if (sumStore.containsKey(diff)) {
                return true;
            }
            sumStore.put(nums[x], x);
        }

        return false;
    }

    public int stackOperations(String S) {
        // Implement your solution here
        Stack<Integer> stack = new Stack<>();
        String[] operationsArr = S.split(" ");

        try {
            for (int x = 0; x < operationsArr.length; x++) {
                switch (operationsArr[x]) {
                    case "POP":
                        stack.pop();
                        break;
                    case "DUP":
                        int dupl = stack.pop();
                        stack.push(dupl);
                        stack.push(dupl);
                        break;
                    case "+":
                        int topEl = stack.pop()+stack.pop();
                        stack.push(topEl);
                        break;
                    case "-":
                        int subVal = stack.pop() - stack.pop();
                        stack.push(subVal);
                        break;
                    default:
                        String operation = String.valueOf(operationsArr[x]);
                        int itemToAdd = Integer.parseInt(operation); //handle integers at this level
                        stack.push(itemToAdd);
                        break;
                }
            }
            return stack.peek();
        } catch (Exception e) {
            return -1;
        }
    }
}
