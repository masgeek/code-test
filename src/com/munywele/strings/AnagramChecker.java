package com.munywele.strings;

import java.util.*;

public class AnagramChecker {
    /**
     * We create two maps, one for each string. We then compare the occurrences of each character in
     * the two maps. If the occurrences are the same, then the strings are anagrams
     * 
     * @param s the first string
     * @param t "anagram"
     * @return The method is returning a boolean value.
     */
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

        mapCharacters(s, lookup);
        mapCharacters(t, lookup2);

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

    /**
     * For each character in the string, if the character is already in the map, increment the count of
     * that character by 1, otherwise add the character to the map with a count of 1
     * 
     * @param str The string to be mapped
     * @param map A map of characters to their count.
     */
    private void mapCharacters(String str, Map<Character, Integer> map) {
        for(int x=0; x<str.length();x++){
            char ch = str.charAt(x);
            if(map.containsKey(ch)){
                int count = map.get(ch);
                map.put(ch,count+1);
            }else {
                map.put(ch, 1);
            }
        }
    }
}
