package ru.zrs.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ValidParenthesesTest {

    @ParameterizedTest
    @MethodSource("validParenthesesArguments")
    public void checkTest(String str, boolean result) {

        assertEquals(result, ValidParentheses.checkValidParentheses(str));
    }

    static Stream<Arguments> validParenthesesArguments() {
        return Stream.of(
                arguments("()", true),
                arguments("()[]{}", true),
                arguments("(]", false)
        );
    }

}
