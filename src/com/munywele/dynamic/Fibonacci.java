package com.munywele.dynamic;


/**
 * This class is a Fibonacci sequence generator
 */
public class Fibonacci {

    /**
     * The function takes in an integer n and returns the nth number in the Fibonacci sequence
     * 
     * @param n the number of the Fibonacci sequence you want to return
     * @return The last number in the sequence.
     */
    public int getFibonacci(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int n1 = 0;
        int n2 = 1;
        int reset = 0;
        for (int x = 1; x <= n; x++) {
            System.out.print(n1 + ", ");
            reset = n1 + n2;
            n2 = n1;
            n1 = reset;
        }

        return reset;
    }
}
