package ru.zrs.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RomanToIntegerTest {

    @ParameterizedTest
    @MethodSource("romanToIntTestArguments")
    public void convertRomanToInteger(String romanNumber, int result) {

        assertEquals(result, RomanToInteger.convertRomanToInteger(romanNumber));
    }

    static Stream<Arguments> romanToIntTestArguments() {
        return Stream.of(
                arguments("III", 3),
                arguments("LVIII", 58),
                arguments("MCMXCIV", 1994)
        );
    }
}
