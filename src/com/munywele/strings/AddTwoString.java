package com.munywele.strings;

public class AddTwoString {
    /**
     * It converts the two strings to numbers, adds them together, and then converts the result back to
     * a string
     * 
     * @param num1 "123"
     * @param num2 "9"
     * @return The sum of the two numbers.
     */
    public String addStrings(String num1, String num2) {

        int number = convertToNumber(num1);
        int number2 = convertToNumber(num2);
        int total = number + number2;
        return String.valueOf(total);
    }

    /**
     * It converts a number to a string.
     * 
     * @param num The number to convert to a string.
     * @return The method convertToString is being returned.
     */
    public String convertNumber(int num) {
        return convertToString(num);
    }


    /**
     * It takes a string of numbers and converts it to an integer
     * 
     * @param numStr The string that you want to convert to a number.
     * @return Integer equivalent of the string value
     */
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

    /**
     * It takes an integer and returns a string representation of that integer
     * 
     * @param num The number to be converted to a string
     * @return The number equivalent in string format
     */
    private String convertToString(int num) {
        int rem = num;
        int modulusVal;
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
