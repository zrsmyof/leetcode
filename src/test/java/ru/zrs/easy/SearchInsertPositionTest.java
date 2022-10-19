package ru.zrs.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SearchInsertPositionTest {

    static Stream<Arguments> testArguments() {
        return Stream.of(
                arguments(new int[]{1, 2, 4}, 3, 2),
                arguments(new int[]{1, 3, 4, 5, 7, 8}, 2, 1),
                arguments(new int[]{1, 2, 2, 3}, 0, 0),
                arguments(new int[]{1, 3, 5, 6}, 2, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    public void searchTest(int[] nums, int val, int result) {

        int k = SearchInsertPosition.searchInsert(nums, val);
        assert result == k;
    }

}
