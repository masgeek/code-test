package com.munywele.maths;

/**
 * The class takes in the money, the cost of the item, and the denominations of the coins and returns
 * the number of coins of each denomination that should be returned as change
 */
public class VendingMachine {
    /**
     * The function takes in the amount of money the customer has, the cost of the item, and the
     * denominations of the coins available. It returns an array of integers that represents the number
     * of coins of each denomination that should be given as change
     * 
     * @param money the amount of money you have
     * @param itemCost The cost of the item
     * @param denom [25, 10, 5, 1]
     * @return The number of coins of each denomination that should be returned as change.
     */
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
