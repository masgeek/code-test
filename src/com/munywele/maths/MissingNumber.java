package com.munywele.maths;

import java.util.List;

public class MissingNumber {
    /**
     * It iterates through the list, and if the list doesn't contain the current number, it returns the
     * current number
     * Time complexity is O(n^2)
     *
     * @param input a list of integers
     * @return The number that is missing from the list.
     */
    public int findMissing(List<Integer> input) {

        int numberCounter = 0;
        for (int number : input) {
            if (!input.contains(numberCounter)) {
                break;
            }
            numberCounter++;
        }

        return numberCounter;
    }

    /**
     * Given a list of integers, find the missing integer
     * <p>
     * Use formula (n*(n+1))/2
     * Time complexity is O(n)
     *
     * @param input a list of integers
     */
    public int findMissingEfficiently(List<Integer> input) {
        int numberSum = 0;
        int n = input.size();
        for (int number : input) {
            numberSum = numberSum + number;
        }

        int sumOfElements = (n*(n + 1)) / 2;
        return sumOfElements - numberSum;
    }
}
