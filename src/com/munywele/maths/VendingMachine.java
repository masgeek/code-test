package com.munywele.maths;

public class VendingMachine {
    public int[] getChange(double money, double itemCost, int[] denom) {

        if (money < itemCost || money == itemCost) {
            return new int[]{};
        }
        int len = denom.length;

        double change = Math.ceil((money - itemCost) * 100);
        int[] changeCount = new int[len];

        for (int x = len - 1; x >= 0; x--) {
            int coinCount = (int) (change / denom[x]);
//            System.out.println("Change is " + change + " and coin count" + coinCount);
            changeCount[x] = coinCount;
            change %= denom[x];
        }
        return changeCount;
    }
}
