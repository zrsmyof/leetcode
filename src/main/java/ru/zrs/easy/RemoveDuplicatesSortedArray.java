package ru.zrs.easy;

public class RemoveDuplicatesSortedArray {

    public static int removeDuplicates(int[] nums) {
        int changeIndex = -1;
        int comparingNumber = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (comparingNumber != nums[i]) {
                comparingNumber = nums[i];
                if (changeIndex != -1) {
                    nums[changeIndex] = nums[i];
                    changeIndex++;
                }
            } else if (comparingNumber == nums[i] && changeIndex == -1) {
                changeIndex = i;
            }
        }
        return changeIndex == -1 ? nums.length : changeIndex;
    }

    public static int removeDuplicatesCorrect(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i == 0 || n > nums[i - 1])
                nums[i++] = n;
        return i;
    }
}
