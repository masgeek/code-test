package com.munywele.strings;

/**
 * This class removes white spaces from a string
 */
public class RemoveWhiteSpaces {
    /**
     * It takes a char array as input and returns a string with all the white spaces and tabs removed
     * 
     * @param s The string to be processed.
     * @return The method is returning a string.
     */
    public String removeWhiteSpaces(char[] s) {

        String result = "";
        for (int x = 0; x <= s.length - 1; x++) {
            if (s[x] != ' ' || s[x] != '\t') {
                result = result + s[x];
            }
        }
        return result;
    }
}
