package com.munywele.maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class VendingMachineTest {
VendingMachine vendingMachine;
    @BeforeEach
    void setUp() {
        vendingMachine = new VendingMachine();
    }


    @Test
    void get_change() {
        int[] expected = new int[]{1,0,0,0,0,4};
        int[] denom = {1, 5, 10, 25, 50, 100};

        int[] result = vendingMachine.getChange(5,0.99,denom);

        assertEquals(Arrays.toString(expected),Arrays.toString(result));
    }

    @Test
    void get_change_b() {
        int[] expected = new int[]{4,0,2,1,1,2};
        int[] denom = {1, 5, 10, 25, 50, 100};

        int[] result = vendingMachine.getChange(3,0.01,denom);

        assertEquals(Arrays.toString(expected),Arrays.toString(result));
    }

    @Test
    void get_change_c() {
        int[] expected = new int[]{1,0,1,1,1,0};
        int[] denom = {1, 5, 10, 25, 50, 100};

        int[] result = vendingMachine.getChange(4,3.14,denom);

        assertEquals(Arrays.toString(expected),Arrays.toString(result));
    }

    @Test
    void get_change_d() {
        int[] expected = new int[]{1,0,1,0,0,0};
        int[] denom = {1, 5, 10, 25, 50, 100};

        int[] result = vendingMachine.getChange(0.45, 0.34,denom);

        assertEquals(Arrays.toString(expected),Arrays.toString(result));
    }
}