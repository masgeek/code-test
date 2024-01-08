package com.munywele.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmallestPositiveIntegerTest {

    SmallestPositiveInteger smallestPositiveInteger;

    @BeforeEach
    void setUp() {
        smallestPositiveInteger = new SmallestPositiveInteger();
    }

    @Test
    void smallest_number_should_be_one() {
        int[] arr1 = {-1, 3};

        int result = smallestPositiveInteger.smallestPositiveInteger(arr1);

        assertEquals(1, result);
    }

    @Test
    void smallest_number_should_be_five() {
        int[] arr1 = {1, 3, 6, 4, 1, 2};

        int result = smallestPositiveInteger.smallestPositiveInteger(arr1);

        assertEquals(5, result);
    }

}
