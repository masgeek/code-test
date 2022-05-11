package com.munywele.dynamic;


public class Fibonacci {

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
