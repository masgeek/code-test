package com.munywele.strings;

import java.util.ArrayList;
import java.util.Iterator;

public class StringCompression {

    /**
     * The function takes a string and returns a compressed version of the string. 
     * 
     * The function works by iterating through the string and keeping track of the number of times a
     * character appears in a row. 
     * 
     * The function then builds a new string with the character and the number of times it appears in a
     * row. 
     * 
     * If the new string is longer than the original string, the original string is returned. 
     * 
     * The function is O(n) because it iterates through the string once. 
     * 
     * 
     * @param str the string to compress
     * @return The compressed string.
     */
    public String compressString(String str) {
        int stringCount = 0;
        char lastChar = 0;
        int currentIndex = 0;
        ArrayList<StringHolder> tracker = new ArrayList<>();
        for(int x = 0; x < str.length();x++){
            char chr =  str.charAt(x);

            if(lastChar==chr){
                stringCount++;
                StringHolder holdIt = tracker.get(currentIndex);
                holdIt.strCount = stringCount;
                tracker.set(currentIndex, holdIt);
            }else {
                stringCount = 1;
                lastChar = chr;
                tracker.add(new StringHolder(chr, stringCount));
                if (tracker.size() > 1) {
                    currentIndex++;
                }
            }
        }

        //iterate and build the string
        StringBuilder tempString = new StringBuilder();
        for(int x=0; x< tracker.size();x++){
            StringHolder stringHolder = tracker.get(x);
            tempString.append(stringHolder.strValue).append(stringHolder.strCount);
        }
        if(str.length() < tempString.length()){
            //return original
            return str;
        }
        return tempString.toString();
    }

    /**
     * A class that holds a character and the number of times it appears in a string.
     */
    class StringHolder{
        char strValue;
        int strCount;

        public StringHolder(char strValue,int strCount){
            this.strValue = strValue;
            this.strCount = strCount;
        }
    }
}
