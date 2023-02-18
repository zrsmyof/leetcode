package ru.zrs.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author zrs
 */
class ValidPalindromeTest {

    ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    void isPalindromeTest() {

        assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(validPalindrome.isPalindrome("race a car"));
        assertTrue(validPalindrome.isPalindrome(" "));

        assertTrue(validPalindrome.isPalindromeCorrect("A man, a plan, a canal: Panama"));
        assertFalse(validPalindrome.isPalindromeCorrect("race a car"));
        assertTrue(validPalindrome.isPalindromeCorrect(" "));
    }
}