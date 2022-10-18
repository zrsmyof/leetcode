package ru.zrs.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;
import static ru.zrs.easy.RemoveDuplicatesSortedArray.removeDuplicatesCorrect;

public class RemoveDuplicatesSortedArrayTest {

    static Stream<Arguments> removeDuplicatesArguments() {
        return Stream.of(
                arguments(new int[]{1, 2, 3, 4}, 4, new int[]{1, 2, 3, 4}),
                arguments(new int[]{1, 2, 2, 3, 4, 4, 5, 6, 7, 7, 7, 8}, 8,
                        new int[]{1, 2, 3, 4, 5, 6, 7, 8}),
                arguments(new int[]{1, 2, 2, 3}, 3, new int[]{1, 2, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("removeDuplicatesArguments")
    public void twoSum(int[] nums, int length, int[] resultNums) {

        int k = removeDuplicatesCorrect(nums); // Calls your implementation

        assert k == resultNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == resultNums[i];
        }
    }

}
