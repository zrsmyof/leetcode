package ru.zrs.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RemoveElementTest {

    static Stream<Arguments> removeElementArguments() {
        return Stream.of(
                arguments(new int[]{1, 2, 3, 4}, 4, new int[]{1, 2, 3}),
                arguments(new int[]{1, 2, 2, 3, 4, 4, 5, 6, 7, 7, 7, 8}, 7,
                        new int[]{1, 2, 2, 3, 4, 4, 5, 6, 8}),
                arguments(new int[]{1, 2, 2, 3}, 2, new int[]{1, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("removeElementArguments")
    public void removeTest(int[] nums, int val, int[] resultNums) {

        int k = RemoveElement.removeElement(nums, val); // Calls your implementation

        assert k == resultNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == resultNums[i];
        }
    }

}
