package com.munywele.maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class MissingNumberTest {

    MissingNumber missingNumber;

    @BeforeEach
    void setUp() {
        missingNumber = new MissingNumber();
    }

    @Test
    void find_missing_number() {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(1);
        numbers.add(2);
        numbers.add(0);
        numbers.add(4);
        numbers.add(5);
        int result = missingNumber.findMissing(numbers);

        assertEquals(6, result);
    }

    @Test
    void find_missing_number_a() {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0);
        int result = missingNumber.findMissing(numbers);

        assertEquals(1, result);
    }

    @Test
    void find_missing_number_c() {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(1);
        numbers.add(2);
        numbers.add(0);
        numbers.add(4);
        numbers.add(5);
        int result = missingNumber.findMissingEfficiently(numbers);

        assertEquals(6, result);
    }

    @Test
    void find_missing_number_d() {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0);
        int result = missingNumber.findMissingEfficiently(numbers);

        assertEquals(1, result);
    }


    @Test
    void find_missing_number_e() {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        int result = missingNumber.findMissingEfficiently(numbers);

        assertEquals(6, result);
    }
}