package com.munywele.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuyStockTest {

    BuyStock buyStock;

    @BeforeEach
    void setUp() {
        buyStock = new BuyStock();
    }

    @Test
    void get_maximum_profit() {
        long[] stockList = {7, 1, 5, 3, 6, 4};

        long result = buyStock.getMaxProfit(stockList);

        assertEquals(5, result);

    }

    @Test
    void get_maximum_profit_b() {
        long[] stockList = {13, 10, 8, 4, 10};

        long result = buyStock.getMaxProfit(stockList);

        assertEquals(6, result);

    }

    @Test
    void get_maximum_profit_c() {
        long[] stockList = {12, 5, 9, 19};

        long result = buyStock.getMaxProfit(stockList);

        assertEquals(14, result);

    }

    @Test
    void get_maximum_profit_d() {
        long[] stockList = {8, 6, 5, 4, 3, 2, 1};

        long result = buyStock.getMaxProfit(stockList);

        assertEquals(-1, result);

    }

    @Test
    void return_high_low_price() {
        long[] stockList = {7, 1, 5, 3, 6, 4};

        long[] result = buyStock.getHighLowPrice(stockList);

        assertArrayEquals(new long[]{1, 6}, result);

    }

    @Test
    void return_high_low_price_b() {
        long[] stockList = {12, 5, 9, 19};


        long[] result = buyStock.getHighLowPrice(stockList);

        assertArrayEquals(new long[]{5, 19}, result);

    }

    @Test
    void return_high_low_price_c() {
        long[] stockList = {1, 2, 3, 4, 3, 2, 1, 2, 5};


        long[] result = buyStock.getHighLowPrice(stockList);

        assertArrayEquals(new long[]{1, 5}, result);

    }

    @Test
    void return_high_low_price_d() {
        long[] stockList = {8, 6, 5, 4, 3, 2, 1};


        long[] result = buyStock.getHighLowPrice(stockList);

        assertArrayEquals(new long[]{6, 5}, result);

    }

    @Test
    void return_high_low_price_e() {
        long[] stockList = {2};


        long[] result = buyStock.getHighLowPrice(stockList);

        assertArrayEquals(new long[]{0, 0}, result);

    }
}