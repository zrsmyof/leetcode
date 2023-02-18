package ru.zrs.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zrs
 */
class AddBinaryTest {

    AddBinary addBinary = new AddBinary();

    @Test
    void addBinaryTest() {

        assertEquals("100", addBinary.addBinary("11", "1"));
        assertEquals("100", addBinary.addBinaryCorrect("11", "1"));
        assertEquals("10101", addBinary.addBinary("1010", "1011"));
        assertEquals("10101", addBinary.addBinaryCorrect("1010", "1011"));
    }
}