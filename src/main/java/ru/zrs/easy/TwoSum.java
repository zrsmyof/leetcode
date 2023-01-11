package ru.zrs.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * Complexity O(n)
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsHashMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (numsHashMap.containsKey(diff)) {
                return new int[]{i, numsHashMap.get(diff)};
            }
            numsHashMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("Parameters are not valid");
    }

    /**
     * Complexity O(n^2)
     */
    public static int[] twoSumSquareComplexity(int[] nums, int target) {
        int current;
        for (int i = 0; i < nums.length - 1; i++) {
            current = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (current + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("Parameters are not valid");
    }
}
