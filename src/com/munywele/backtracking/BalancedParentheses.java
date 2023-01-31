package com.munywele.backtracking;

import java.util.ArrayList;

/**
 * It generates all possible combinations of balanced parentheses of a given size
 */
public class BalancedParentheses {
    /**
     * It generates all the possible combinations of n pairs of parentheses.
     * 
     * @param n number of parentheses pairs
     * @return An ArrayList of Strings.
     */
    public ArrayList<String> generateCombinations(int n) {
        ArrayList<String> result = new ArrayList<>();
        if (n > 0) {
            String myResultString = "";
            StringBuilder myResultStringBuilder = new StringBuilder();
//            generateParentheses(result, myResultStringBuilder, n, 0, 0);
            generateParentheses(result, myResultString, n, 0, 0);
        }
        return result;
    }

    /**
     * If the number of open parentheses is less than the size, add an open parenthesis and recurse. If
     * the number of close parentheses is less than the number of open parentheses, add a close
     * parenthesis and recurse
     * 
     * @param resultHolder The list of all the possible combinations of parentheses.
     * @param result The result string that we are building.
     * @param size the number of pairs of parentheses
     * @param open number of open parentheses
     * @param close number of close parentheses we need to add
     */
    private void generateParentheses(ArrayList<String> resultHolder, StringBuilder result, int size, int open, int close) {
        if (result.length() == size * 2) {
            resultHolder.add(result.toString());
            return;
        }

        if (open < size) {
            result.append("{");
            generateParentheses(resultHolder, result, size, open + 1, close);
            result.deleteCharAt(result.length() - 1);
        }

        if (close < open) {
            result.append("}");
            generateParentheses(resultHolder, result, size, open, close + 1);
            // Removing the last character from the string.
            result.deleteCharAt(result.length() - 1);
        }
    }

    /**
     * If we have more open parentheses than closed ones, we can always add a closed one. If we have
     * fewer open parentheses than closed ones, then we must add an open one
     * 
     * @param resultHolder The list of all the possible results
     * @param result The current string that we are building.
     * @param size the number of parentheses to generate
     * @param open number of open brackets
     * @param close number of closing brackets we have added so far
     */
    void generateParentheses(ArrayList<String> resultHolder, String result, int size, int open, int close) {
        if (close == size) {
            resultHolder.add(result);
            return;
        }
        if (open < size) {
            generateParentheses(resultHolder, result + "{", size, open + 1, close);
        }
        if (open > close) {
            // Adding a closing bracket to the result string and then recursing.
            generateParentheses(resultHolder, result + "}", size, open, close + 1);
        }
    }
}
