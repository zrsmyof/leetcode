package ru.zrs.easy;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int beginIdx = 0, endIdx = nums.length - 1;
        while (beginIdx <= endIdx) {
            int mid = (beginIdx + endIdx) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) endIdx = mid - 1;
            else beginIdx = mid + 1;
        }
        return beginIdx;
    }
}
