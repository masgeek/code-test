package com.munywele.arrays;

import java.util.*;

public class SmallestPositiveInteger {

    public int smallestPositiveInteger(int[] integerArr) {
        int smallest = 1;
        Set<Integer> numberSet = new HashSet<>();


        for (int x = 0; x < integerArr.length; x++) {
            int currentVal = integerArr[x];
            numberSet.add(currentVal);
        }
        //loop through all positive integers
        for (int x = 1; x <= Integer.MAX_VALUE; x++) {
            if (!numberSet.contains(x)) { //if number is not in set return that number
                return x;
            }
        }
        return smallest;
    }

}
