package ru.zrs.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zrs
 */
class CompressStringTest {

    CompressString compressString = new CompressString();

    @Test
    void compress() {

        assertEquals("0-5,8-9,11", compressString.compress(new int[]{1, 4, 5, 2, 3, 9, 8, 11, 0}));
        assertEquals("1-4", compressString.compress(new int[]{1, 4, 3, 2}));
        assertEquals("1,4", compressString.compress(new int[]{1, 4}));
    }

    @Test
    void compressOptimized() {
        assertEquals("0-5,8-9,11", compressString.compressOptimized(new int[]{1, 4, 5, 2, 3, 9, 8, 11, 0}));
    }

    @Test
    void compressOptimizedWithClass() {
        assertEquals("0-5,8-9,11", compressString.compressOptimizedWithClass(new int[]{1, 4, 5, 2, 3, 9, 8, 11, 0}));
    }
}