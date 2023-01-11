package ru.zrs.easy;

import java.util.Arrays;

public class MissingNumber {

    public static int processWithArithmeticSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return (nums.length) * (nums.length + 1) / 2 - sum;
    }

    public static int processWIthQuickSort(int[] nums) {
        System.out.println("Initial array: " + Arrays.toString(nums));
        quickSort(nums, 0, nums.length - 1);
        System.out.println("Array after sorting: " + Arrays.toString(nums));
        int start = 0;
        int end = nums.length - 1;
        int guess = start;
        while (start <= end) {
            guess = (start + end) / 2;
            if (guess >= nums[guess]) {
                start = guess + 1;
            }
            if (guess < nums[guess]) {
                end = guess - 1;
            }
        }
        return start;
    }

    private static void quickSort(int[] nums, int start, int end) {
        if (start < end) {
            int mid = partition(nums, start, end);
            quickSort(nums, start, mid - 1);
            quickSort(nums, mid, end);
        }
    }

    private static int partition(int[] nums, int start, int end) {
        int midEl = nums[start];
        while (start <= end) {
            while (midEl > nums[start]) {
                start++;
            }
            while (midEl < nums[end]) {
                end--;
            }

            if (start <= end) {
                int tmp = nums[start];
                nums[start] = nums[end];
                nums[end] = tmp;
                start++;
                end--;
            }
        }
        return start;
    }
}
