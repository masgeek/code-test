package com.munywele.strings;

public class AddTwoString {
    public String addStrings(String num1, String num2) {

        int number = convertToNumber(num1);
        int number2 = convertToNumber(num2);
        int total = number + number2;
        return String.valueOf(total);
    }

    public String convertNumber(int num) {
        return convertToString(num);
    }


    private int convertToNumber(String numStr) {
        char[] nums = numStr.toCharArray();
        int num = 0;
        for (int x = 0; x < nums.length; x++) {
            //ASCII table 0 = 48 and 9 =57
            int numChar = nums[x] - 48;
            num = (num * 10) + numChar;
        }
        return num;
    }

    private String convertToString(int num) {
        int rem = num;
        int modulusVal = num;
        String numString = "";
        while (rem > 0) {
            modulusVal = rem % 10;
            rem = rem / 10;
            char c = (char) (modulusVal + 48);
            numString = c + numString;

        }
        return numString;
    }
}
