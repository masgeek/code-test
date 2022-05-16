package com.munywele.strings;

import java.util.*;
/**
 * This class removes duplicate characters from a string
 */
public class DuplicateStringRemover {
    /**
     * It takes a string and returns a string with all the duplicate characters removed
     * 
     * @param str The string to be checked for duplicates
     * @return The string without duplicates.
     */
    public String removeDuplicates(char[] str) {
        String result = "";
        for(int x = 0; x<=str.length-1;x++){
            String cha = String.valueOf(str[x]);
            if(!result.contains(cha)){
                result = result + cha;
            }
        }
        return result;
    }

    /**
     * The function takes a string as input and returns a string with all the duplicate characters
     * removed and the remaining characters sorted in lexicographical order
     * 
     * @param s String
     * @return The method is returning a string that is the same as the input string but with all the
     * duplicate characters removed.
     */
    public String removeDuplicatesLexicoGraphOrder(String s) {
        if(s==""||s.length()==0){
            return null;
        }
        char[] str = s.toCharArray();
        String result = "";
        for(int x = 0; x<=str.length-1;x++){
            String cha = String.valueOf(str[x]);
            if(!result.contains(cha)){
                result = result + cha;
            }
        }
        char[] finalResult = result.toCharArray();
        Arrays.sort(finalResult);
        return new String(finalResult);
    }
}
