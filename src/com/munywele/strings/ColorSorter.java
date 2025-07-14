package com.munywele.strings;

public class ColorSorter {

    /**
     * #PlN
     * Orders a list of color strings suffixed with a digit by that digit.
     *
     * Example:
     *   Input:  "red2 blue1 green3"
     *   Output: "blue red green"
     *
     * Assumptions:
     * - Each word ends with a digit from '1' to '9'
     * - The number indicates the 1-based position in the final output
     */
    public String orderColors(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        String[] colors = str.split(" ");
        String[] result = new String[colors.length];

        for (String color : colors) {
            char lastChar = color.charAt(color.length() - 1);
            int pos = lastChar - '1'; // convert '1'-'9' to 0-8
            result[pos] = color.substring(0, color.length() - 1);
        }

        StringBuilder ordered = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            ordered.append(result[i]);
            if (i < result.length - 1) {
                ordered.append(" ");
            }
        }

        return ordered.toString();
    }

    /**
     * #PlN
     * Orders a list of color strings suffixed with a digit by that digit.
     * This is a classic implementation without using Character.getNumericValue or String.join.
     *
     * Example:
     *   Input:  "yellow3 red1 blue2"
     *   Output: "red blue yellow"
     *
     * Assumes:
     * - Non-null, non-empty input string
     * - Each word ends with a digit from '1' to '9'
     */
    public String orderColorsClassic(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        String[] colors = str.split(" ");
        String[] result = new String[colors.length];

        for (String color : colors) {
            char lastChar = color.charAt(color.length() - 1);
            int pos = lastChar - '1'; // convert '1'-'9' to 0-8
            result[pos] = color.substring(0, color.length() - 1);
        }

        StringBuilder ordered = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            ordered.append(result[i]);
            if (i < result.length - 1) {
                ordered.append(" ");
            }
        }

        return ordered.toString();
    }
}
