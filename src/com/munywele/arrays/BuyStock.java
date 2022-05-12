package com.munywele.arrays;

public class BuyStock {
    public long getMaxProfit(long[] stockList) {

        if (stockList.length == 0) {
            return 0;
        }
        long minBuy = stockList[0];
        long maxSell = stockList[1];
        long globalProfit = maxSell - minBuy;
        long currentProfit = Integer.MIN_VALUE;

        for (int x = 1; x < stockList.length; x++) {
            currentProfit = stockList[x] - minBuy;
            if (currentProfit > globalProfit) {
                globalProfit = currentProfit;
                maxSell = stockList[x];
            }
            if (minBuy > stockList[x]) {
                minBuy = stockList[x];
            }
        }

        return globalProfit;
    }

    public long[] getHighLowPrice(long[] stockList) {
        if (stockList.length == 0 || stockList.length == 1) {
            return new long[]{0, 0};
        }

        long minBuy = stockList[0];
        long maxSell = stockList[1];
        long globalProfit = maxSell - minBuy;
        long currentProfit = Long.MIN_VALUE;


        for (int x = 1; x <= stockList.length - 1; x++) {
            currentProfit = stockList[x] - minBuy;
            if (currentProfit > globalProfit) {
                globalProfit = currentProfit;
                maxSell = stockList[x];
            }

            if (minBuy > stockList[x]) {
                minBuy = stockList[x];
            }
        }

        return new long[]{maxSell - globalProfit, maxSell};
    }
}
