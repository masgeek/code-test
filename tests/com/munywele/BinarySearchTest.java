package com.munywele;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void elementPosition() {
        int[] elements = {1,2,4,6,8,9,12};
        int theElement = 6;

        BinarySearch binarySearch = new BinarySearch();
        int position = binarySearch.elementPosition(elements,theElement);

        assertEquals(3, position);
    }
}