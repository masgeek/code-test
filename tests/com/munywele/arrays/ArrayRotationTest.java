package com.munywele.arrays;

import com.munywele.arrays.ArrayRotation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayRotationTest {

    ArrayRotation rotation;

    @BeforeEach
    void setUp() {
        rotation = new ArrayRotation();
    }


    @Test
    void rotated_array_1(){
        int[] nums = {1, 10, 20, 0, 59, 86, 32, 11, 9, 40};
        int target = 19;

        int[] result = rotation.rotateArray(nums, target);

        System.out.print(Arrays.toString(result));
        assertArrayEquals(new int[]{9, 40, 1, 10, 20, 0, 59, 86, 32, 11}, result);
    }

}
