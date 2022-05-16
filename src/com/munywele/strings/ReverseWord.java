package com.munywele.strings;

import java.util.*;
public class ReverseWord {
    public String reverseWord(char[] theWord) {
        String singleWord = "";

        //convert char to words
        for(int x = 0; x<=theWord.length-1;x++){
            String temp = String.valueOf(theWord[x]);
            singleWord = singleWord+temp;
        }

        String[] split = singleWord.split(" ");//split at space
        //reverse the split word;
        String reversed = "";
        for(int x = split.length-1; x>=0;x--){
            if(reversed.length() > 0){
                reversed = reversed + " "+split[x];
            }else {
                reversed = reversed + split[x];
            }
        }
        return reversed;
    }
}
