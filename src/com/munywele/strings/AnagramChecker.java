package com.munywele.strings;

import java.util.*;

public class AnagramChecker {
    public boolean isAnagram(String s, String t) {
        if(s==null||t==null){
            return false;
        }

        if(s.length()!=t.length()){
            return false;
        }

        boolean isAnagram = true;
        Map<Character,Integer> lookup = new HashMap<>();
        Map<Character,Integer> lookup2 = new HashMap<>();
        for(int x=0; x<s.length();x++){
            char ch = s.charAt(x);
            if(lookup.containsKey(ch)){
                int count = lookup.get(ch);
                lookup.put(ch,count+1);
            }else {
                lookup.put(ch, 1);
            }
        }

        for(int x=0; x<t.length();x++){
            char ch = t.charAt(x);
            if(lookup2.containsKey(ch)){
                int count = lookup2.get(ch);
                lookup2.put(ch,count+1);
            }else {
                lookup2.put(ch, 1);
            }
        }

        //compare the occurrences
        for(Map.Entry<Character,Integer> map1:lookup.entrySet()){
            char value = map1.getKey();
            int counter = map1.getValue();
            int counterb = lookup2.getOrDefault(value,0);
            if(counter!=counterb){
                return false;
            }

        }

        return isAnagram;
    }
}
