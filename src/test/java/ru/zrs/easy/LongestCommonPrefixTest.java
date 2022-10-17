package ru.zrs.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LongestCommonPrefixTest {

    @ParameterizedTest
    @MethodSource("commonPrefixArguments")
    public void commonPrefixTest(String[] strs, String result) {

        assertEquals(result, LongestCommonPrefix.findLongestCommonPrefix(strs));
    }

    static Stream<Arguments> commonPrefixArguments() {
        return Stream.of(
                arguments(new String[]{"flower","flow","flight"}, "fl"),
                arguments(new String[]{"dog","racecar","car"}, ""),
                arguments(new String[]{"qwerty","","qwefgh"}, "")
        );
    }

}
