package ru.zrs.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author zrs
 */
class PlusOneTest {

    PlusOne plusOne = new PlusOne();

    @Test
    void plusOneTest() {

        assertArrayEquals(new int[]{1, 2, 3, 5}, plusOne.plusOne(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{1, 0, 0, 0, 0}, plusOne.plusOne(new int[]{9, 9, 9, 9}));

    }
}