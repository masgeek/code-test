package com.munywele.search;

public class CandyMaker {
    /*
    Complete the minimumPasses function in the editor below. The function must return a long integer representing the minimum number of passes required.

minimumPasses has the following parameter(s):

m: long integer, the starting number of machines
w: long integer, the starting number of workers
p: long integer, the cost of a new hire or a new machine
n: long integer, the number of candies to produce
     * Complete the 'minimumPasses' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. LONG_INTEGER m
     *  2. LONG_INTEGER w
     *  3. LONG_INTEGER p
     *  4. LONG_INTEGER n
     */

    public long minimumPasses(long m, long w, long p, long n) {
        // Write your code here
        long candies = 0;
        long investAmount = 0; //get the max value possible
        long spendAmount = Long.MAX_VALUE;
        long finalPass = 0;
        while (candies < n) {
//            long passes = (p - candies) / (m * w);
            long passes = (long) (((p - candies) / (double) m) / w);
            if (passes <= 0) {
                //machines that can be bought
                long machine = candies / p + m + w;
                long half = machine >>> 1;
                if (m > w) {
                    m = Math.max(m, half);
                    w = machine - m;
                } else {
                    w = Math.max(w, half);
                    m = machine - w;
                }
                candies = candies % p;
                passes = passes +1;
            }

            long mw;
            long pmw;
            try {
                mw = Math.multiplyExact(m, w);
                pmw = Math.multiplyExact(passes, mw);
            } catch (Exception ex) {
                // we need to add current pass
                investAmount += 1;
                // increment will be 1 because of overflow
                spendAmount = Math.min(spendAmount, investAmount + 1);
                finalPass = finalPass + passes;
                System.out.println("Arithmetic error occurred--stopping loop >>> " + ex.getMessage());
                break;
            }

            candies += pmw;
            investAmount += passes;
            long increment = (long) Math.ceil((n - candies) / (double) mw);
            spendAmount = Math.min(spendAmount, spendAmount + increment);
            finalPass = finalPass + passes;
        }
        return finalPass;
    }

}
