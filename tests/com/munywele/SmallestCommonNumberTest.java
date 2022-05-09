package com.munywele;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestCommonNumberTest {

    SmallestCommonNumber smallestCommonNumber;

    @BeforeEach
    void setUp() {
        smallestCommonNumber = new SmallestCommonNumber();
    }

    @Test
    void smallest_common_number() {
        int[] arr1 = {6, 7, 10, 25, 30, 63, 64};
        int[] arr2 = {0, 4, 5, 6, 7, 8, 50};
        int[] arr3 = {1, 6, 7, 10, 14};

        int result = smallestCommonNumber.findSmallestCommonNumber(arr1, arr2, arr3);

        assertEquals(6, result);
    }

    @Test
    void smallest_common_number_2() {
        int[] arr1 = {1,2};
        int[] arr2 = {3};
        int[] arr3 = {5};

        int result = smallestCommonNumber.findSmallestCommonNumber(arr1, arr2, arr3);

        assertEquals(-1, result);
    }
}