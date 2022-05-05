package com.munywele;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void check_position_of_6() {
        int[] elements = {1, 2, 4, 6, 8, 9, 11, 12};
        int theElement = 6;

        BinarySearch binarySearch = new BinarySearch();
        int position = binarySearch.iterative(elements, theElement);

        assertEquals(3, position);
    }

    @Test
    void check_position_of_12() {
        int[] elements = {0, 2, 4, 6, 8, 10, 12, 14, 16};
        int theElement = 12;

        BinarySearch binarySearch = new BinarySearch();
        int position = binarySearch.iterative(elements, theElement);

        assertEquals(6, position);
    }

    @Test
    void check_position_of_5() {
        int[] elements = {0, 2, 4, 6, 8, 10, 12, 14, 16};
        int theElement = 5;

        BinarySearch binarySearch = new BinarySearch();
        int position = binarySearch.iterative(elements, theElement);

        assertEquals(-1, position);
    }

    @Test
    void check_position_of_empty() {
        int[] elements = {};
        int theElement = 5;

        BinarySearch binarySearch = new BinarySearch();
        int position = binarySearch.iterative(elements, theElement);

        assertEquals(-1, position);
    }

    @Test
    void check_position_of_6_recursively() {
        int[] elements = {1, 2, 4, 6, 8, 9, 11, 12};
        int theElement = 6;
        int low = 0;
        int high = elements.length - 1;

        BinarySearch binarySearch = new BinarySearch();
        int position = binarySearch.recursive(elements, theElement, low, high);

        assertEquals(3, position);
    }

    @Test
    void check_position_of_non_matching_recursively() {
        int[] elements = {};
        int theElement = 6;
        int low = 0;
        int high = elements.length - 1;

        BinarySearch binarySearch = new BinarySearch();
        int position = binarySearch.recursive(elements, theElement, low, high);

        assertEquals(-1, position);
    }
}