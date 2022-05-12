package com.munywele.arrays;

/**
 * We keep track of the minimum buy price and the maximum sell price. We update the minimum buy price
 * if we find a lower buy price. We update the maximum sell price if we find a higher sell price
 */
public class BuyStock {
    
    /**
     * We keep track of the minimum buy price and the maximum sell price. We update the minimum buy
     * price if we find a lower buy price. We update the maximum sell price if we find a higher sell
     * price
     * 
     * @param stockList an array of stock prices
     * @return The maximum profit that can be made by buying and selling a stock.
     */
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

    /**
     * We keep track of the minimum buy price and the maximum sell price. We also keep track of the
     * global profit and the current profit. We iterate through the array and update the minimum buy
     * price and the maximum sell price
     * 
     * @param stockList an array of stock prices
     * @return The buy sell combo that will return highest profit that can be made from buying and selling a stock.
     */
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
