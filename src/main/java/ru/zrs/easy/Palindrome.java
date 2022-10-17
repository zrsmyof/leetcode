package ru.zrs.easy;

public class Palindrome {

    public static boolean isPalindrome(int x) {
        int tempx = x;
        int sum = 0;
        while (tempx > 0) {
            int d = tempx % 10;
            sum = sum * 10 + d;
            tempx /= 10;
        }
        return sum == x;
    }
}
