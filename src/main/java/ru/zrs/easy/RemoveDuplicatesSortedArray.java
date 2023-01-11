package ru.zrs.easy;

public class RemoveDuplicatesSortedArray {

    public static int removeDuplicatesCorrect(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i == 0 || n > nums[i - 1])
                nums[i++] = n;
        return i;
    }
}
