package ru.zrs.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrtTest {

    @Test
    public void test() {
        assertEquals(2, Sqrt.sqrt(4));
        assertEquals(2, Sqrt.sqrt(8));
        assertEquals(4, Sqrt.sqrt(17));
    }

}
