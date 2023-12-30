package com.munywele.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class StringSearcher {

    private String[] fileList;
    private String searchTerm;

    public StringSearcher(String[] fileList) {
        this.fileList = fileList;
    }

    public String[] returnFileList(String pt) {
        if (fileList.length == 0) {
            return new String[]{};
        }
        if (pt == null || pt.length() == 0) {
            return new String[]{};
        }


        char[] search = pt.toCharArray();

        Arrays.asList(fileList).contains(String.valueOf(search[0]));
        ArrayList<String> lookup = new ArrayList<>();
        for (int x = 0; x < fileList.length; x++) {
            String s = fileList[x];
            for (int y = 0; y < search.length; y++) {
                String checkStr = String.valueOf(search[y]);
                if (s.contains(checkStr.toUpperCase())) {
                    if (!lookup.contains(s)) {
                        lookup.add(s);
                    }
                }
            }
        }

        String[] results = new String[lookup.size()];
        for (int x = 0; x < lookup.size(); x++) {
            String str = lookup.get(x);
            results[x] = str;
        }
        return results;
    }

    public static void main(String[] args) {
        StringSearcher stringSearcher = new StringSearcher(new String[]{"AbstractBorder.java", "MemoryMapper.java"});
        String[] result = stringSearcher.returnFileList("ab");
        String[] result2  = stringSearcher.returnFileList("mm");

        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));
    }

}
