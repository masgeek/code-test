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

    public int stackOperations(String stringValue) {
        // Implement your solution here
        Stack<Integer> stack = new Stack<>();
//        Deque<Integer> stack = new ArrayDeque<>();
        String[] operationsArr = stringValue.split(" ");

        try {
            for (int x = 0; x < operationsArr.length; x++) {
                switch (operationsArr[x]) {
                    case "POP" -> stack.pop();
                    case "DUP" -> {
                        int duplicateValue = stack.pop();
                        stack.push(duplicateValue);
                        stack.push(duplicateValue);
                    }
                    case "+" -> {
                        int topEl = stack.pop() + stack.pop();
                        stack.push(topEl);
                    }
                    case "-" -> {
                        int firstSubVal = stack.pop();
                        int secondSubVal = stack.pop();
                        int subVal = firstSubVal - secondSubVal;
                        stack.push(subVal);
                    }
                    default -> {
                        String operation = String.valueOf(operationsArr[x]);
                        int itemToAdd = Integer.parseInt(operation); //handle integers at this level
                        stack.push(itemToAdd);
                    }
                }
            }
            return stack.peek(); //get the element at top of stack without removing it
        } catch (Exception e) {
            return -1;
        }
    }
}
