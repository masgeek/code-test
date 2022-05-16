package com.munywele.strings;

import java.util.*;
public class DuplicateStringRemover {
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
