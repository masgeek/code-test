package com.munywele;


import java.util.*;

/**
 * The class takes in three arrays and returns the smallest common number in the three arrays
 */
public class SmallestCommonNumber {


    /**
     * We iterate through each array and store the numbers in a hashmap. The key is the number and the
     * value is the number of times the number appears in the arrays. We then iterate through the
     * hashmap and find the number that appears the most
     * 
     * Complexity is O(n)
     * 
     * @param arr1 [6, 7, 10, 25, 30, 63, 64]
     * @param arr2 [6, 7, 10, 25, 30, 63, 64]
     * @param arr3 [6, 7, 10, 25, 30, 63, 64]
     * @return The smallest common number in the three arrays.
     */
    public int findSmallestCommonNumber(int[] arr1, int[] arr2, int[] arr3) {

        Map<Integer, Integer> commonNumbers = new HashMap<>();

        for (int x1 = 0; x1 < arr1.length - 1; x1++) {
            int val = arr1[x1];
            commonNumbers.put(val, 1);
        }

        iterateTheArray(arr2, commonNumbers);

        iterateTheArray(arr3, commonNumbers);

        //evaluate the numbers in the hashmap
        int smallestCommonNumber = -1;
        int prevCount = 0;
        for (Map.Entry<Integer, Integer> value : commonNumbers.entrySet()) {
            int theNumber = value.getKey();
            int numberCount = value.getValue();
            if (numberCount > prevCount && numberCount == 3) {
                prevCount = numberCount;
                smallestCommonNumber = theNumber;
            }
        }
        return smallestCommonNumber;
    }

    private void iterateTheArray(int[] theArr, Map<Integer, Integer> commonNumbers) {
        for (int x3 = 0; x3 < theArr.length - 1; x3++) {
            int val = theArr[x3];
            if (commonNumbers.containsKey(val)) {
                int counter = commonNumbers.get(val);
                commonNumbers.put(val, counter + 1);
            } else {
                commonNumbers.put(val, 1);
            }
        }
    }
}
