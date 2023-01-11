package ru.zrs.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TwoSumTest {

    @ParameterizedTest
    @MethodSource("towSumTestArguments")
    public void twoSum(int[] nums, int target, int[] expectedOutPut) {

        int[] output = TwoSum.twoSum(nums, target);
        Arrays.sort(output);
        assertArrayEquals(expectedOutPut, output);
        output = TwoSum.twoSumSquareComplexity(nums, target);
        Arrays.sort(output);
        assertArrayEquals(expectedOutPut, output);
    }

    @ParameterizedTest
    @MethodSource("towSumTestIllegalArguments")
    public void towSumException(int[] nums, int target) {
        assertThrows(IllegalArgumentException.class, () -> TwoSum.twoSum(nums, target));
    }

    static Stream<Arguments> towSumTestArguments() {
        return Stream.of(
                arguments(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                arguments(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                arguments(new int[]{3, 3}, 6, new int[]{0, 1})
        );
    }

    static Stream<Arguments> towSumTestIllegalArguments() {
        return Stream.of(
                arguments(new int[]{2, 7, 11, 15}, 10),
                arguments(new int[]{3, 2, 4}, 9),
                arguments(new int[]{3, 3}, 9)
        );
    }

}
