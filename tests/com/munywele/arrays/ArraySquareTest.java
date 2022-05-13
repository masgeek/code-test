package com.munywele.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArraySquareTest {
    ArraySquare arraySquare;

    @BeforeEach
    void setUp() {
        arraySquare = new ArraySquare();
    }


    @Test
    void return_array_of_squares() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = arraySquare.computeSquare(nums);
        int[] expected = new int[]{0, 1, 9, 16, 100};
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    @Test
    void return_array_of_squares_b() {
        int[] nums = {-7, -3, 2, 3, 11};
        int[] result = arraySquare.computeSquare(nums);
        int[] expected = new int[]{4, 9, 9, 49, 121};
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    @Test
    void return_array_of_squares_c() {
        int[] nums = {-100,100};
        int[] result = arraySquare.computeSquare(nums);
        int[] expected = new int[]{10000,10000};
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    @Test
    void return_array_of_squares_d() {
        int[] nums = {-5};
        int[] result = arraySquare.computeSquare(nums);
        int[] expected = new int[]{25};
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }
}