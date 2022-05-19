package com.munywele.maths;

import java.util.*;

/**
 * For each character in the input, swap it with the first character, and then recursively call the
 * function with the new input
 */
public class StringPermutation {
    /**
     * It returns all the permutations of a string.
     * 
     * @param input The input string
     * @return A set of all the permutations of the input string.
     */
    public Set<String> permuteString(String input) {
        Set<String> result = new HashSet<>();
        permuteData(result, input.toCharArray(), 0);
        return result;
    }

    /**
     * For each character in the input, swap it with the first character, and then recursively call the
     * function with the new input
     * 
     * @param result This is the set that will contain all the permutations.
     * @param input the input string
     * @param currentIndex The current index of the array.
     */
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

    /**
     * Swap the characters at the current index and the index of the character that is the largest in
     * the rest of the string
     * 
     * @param input The input string
     * @param currentIndex The index of the character that we are currently swapping.
     * @param x the index of the character to swap with the current character
     */
    private void swapCharacters(char[] input, int currentIndex, int x) {
        char tmp = input[currentIndex];
        input[currentIndex] = input[x];
        input[x] = tmp;
    }


}
