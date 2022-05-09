package com.munywele;


import java.time.temporal.ValueRange;
import java.util.*;

public class SmallestCommonNumber {
    public int findSmallestCommonNumber(int[] arr1, int[] arr2, int[] arr3) {

        Map<Integer, Integer> commonNumbers = new HashMap<>();

        for (int x1 = 0; x1 < arr1.length - 1; x1++) {
            int val = arr1[x1];
            commonNumbers.put(val, 1);
        }

        for (int x2 = 0; x2 < arr2.length - 1; x2++) {
            int val = arr2[x2];
            if (commonNumbers.containsKey(val)) {
                int counter = commonNumbers.get(val);
                commonNumbers.put(val, counter + 1);
            } else {
                commonNumbers.put(val, 1);
            }
        }

        for (int x3 = 0; x3 < arr3.length - 1; x3++) {
            int val = arr3[x3];
            if (commonNumbers.containsKey(val)) {
                int counter = commonNumbers.get(val);
                commonNumbers.put(val, counter + 1);
            } else {
                commonNumbers.put(val, 1);
            }
        }

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
}
