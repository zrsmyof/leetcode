package ru.zrs.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

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
}
