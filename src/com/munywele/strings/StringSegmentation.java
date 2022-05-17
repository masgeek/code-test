package com.munywele.strings;

import java.util.*;

public class StringSegmentation {

    public boolean canSegmentString(String inputString, Set<String> dictionary) {

        //loop through dictionary
        Iterator<String> s = dictionary.iterator();
        for (int x = 1; x <= inputString.length(); x++) {
            String first = inputString.substring(0, x);
            if (dictionary.contains(first)) {
                System.out.println(first);
            }
        }
        return false;
    }

}
