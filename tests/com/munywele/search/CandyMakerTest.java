package com.munywele.search;

import static org.junit.jupiter.api.Assertions.*;

class CandyMakerTest {
    CandyMaker candyMaker;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        candyMaker = new CandyMaker();
    }

    @org.junit.jupiter.api.Test
    void minimum_pass_should_be_3() {
        long result = candyMaker.minimumPasses(3, 1, 2, 12);
        assertEquals(3, result);
    }

    @org.junit.jupiter.api.Test
    void minimum_pass_should_be_16() {
        long result = candyMaker.minimumPasses(1, 1, 6, 45);
        assertEquals(16, result);
    }

    @org.junit.jupiter.api.Test
    void minimum_pass_should_be_1() {
        long result = candyMaker.minimumPasses(5184889632L ,5184889632L ,20 ,10000);
        assertEquals(1, result);
    }
}