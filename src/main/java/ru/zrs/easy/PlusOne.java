package ru.zrs.easy;

/**
 * @author zrs
 * <p>
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 * [1,2,3] -> [1,2,4]
 * [4,3,2,1] -> [4,3,2,2]
 * [9] -> [1,0]
 * [1,3,4,9] -> [1,3,5,0]
 * [9,9,9] -> [1,0,0,0]
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        int[] digitsPlusOne = new int[digits.length + 1];
        digitsPlusOne[0] = 1;
        return digitsPlusOne;
    }
}
