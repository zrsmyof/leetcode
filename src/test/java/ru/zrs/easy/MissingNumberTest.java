package ru.zrs.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {

    @Test
    public void test() {

        assertEquals(4, MissingNumber.processWithArithmeticSum(new int[]{9, 8, 7, 6, 5, 3, 2, 1, 0}));
        assertEquals(4, MissingNumber.processWIthQuickSort(new int[]{9, 8, 7, 6, 5, 3, 2, 1, 0}));
    }
}
