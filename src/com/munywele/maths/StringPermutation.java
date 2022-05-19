package com.munywele.maths;

import java.util.*;

public class StringPermutation {
    public Set<String> permuteString(String input) {
        Set<String> result = new HashSet<>();
        permuteData(result, input.toCharArray(), 0);
        return result;
    }

    private void permuteData(Set<String> result, char[] input, int currentIndex) {

        if (input.length == 0) {
            result.add("");
            return;
        }

        //check for duplicate
        if (currentIndex == input.length - 1) {
            result.add(new String(input));
            return;
        }

        for (int x = currentIndex; x < input.length; x++) {
            //swap positions
            swapCharacters(input, currentIndex, x);
            permuteData(result, input, currentIndex + 1);
            swapCharacters(input, currentIndex, x);
        }
    }

    private void swapCharacters(char[] input, int currentIndex, int x) {
        char tmp = input[currentIndex];
        input[currentIndex] = input[x];
        input[x] = tmp;
    }


}
