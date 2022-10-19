package ru.zrs.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LastWordTest {

    static Stream<Arguments> testArguments() {
        return Stream.of(
                arguments("Hello World", 5),
                arguments("   fly me   to   the moon  ", 4),
                arguments("luffy is still joyboy", 6),
                arguments("a", 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    public void lastWordTest(String s, int result) {

        assert result == LastWord.lengthOfLastWord(s);
    }

}
