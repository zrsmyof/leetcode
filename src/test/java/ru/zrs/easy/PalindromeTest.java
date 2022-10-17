package ru.zrs.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PalindromeTest {

    @ParameterizedTest
    @MethodSource("palindromeTestArguments")
    public void isPalindromeTest(int target, boolean result) {

        assertEquals(result, Palindrome.isPalindrome(target));
    }

    static Stream<Arguments> palindromeTestArguments() {
        return Stream.of(
                arguments(121, true),
                arguments(-121, false),
                arguments(10, false)
        );
    }

}
