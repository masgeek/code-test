package com.munywele.arrays;

import com.munywele.arrays.MoveZero;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroTest {

    MoveZero moveZero;

    @BeforeEach
    void setUp() {
        moveZero = new MoveZero();
    }

    @Test
    void move_zeroes_to_left() {
        int[] nums = {1, 10, 20, 0, 59, 63, 0, 88, 0};

        int[] result = moveZero.moveZeroToLeft(nums);

        assertArrayEquals(new int[]{0, 0, 0, 1, 10, 20, 59, 63, 88}, result);
    }

    @Test
    void move_zeroes_to_left_2() {
        int[] nums = {1, 10, 20, 0, 59, 63, 0, 88, 0};

        int[] result = moveZero.moveZeroToLeft(nums);

        assertArrayEquals(new int[]{0, 0, 0, 1, 10, 20, 59, 63, 88}, result);
    }
}