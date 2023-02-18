package ru.zrs.easy;

import java.util.Set;

/**
 * @author zrs
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        Set<Character> alphaNumeric = Set.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
        String low = s.toLowerCase();
        int left = 0;
        int right = low.length() - 1;
        while (left < right) {
            while (left < right && !alphaNumeric.contains(low.charAt(left))) {
                left++;
            }
            while (left < right && !alphaNumeric.contains(low.charAt(right))) {
                right--;
            }
            if (left < right && low.charAt(left) != low.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isPalindromeCorrect(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while (head <= tail) {
            cHead = s.charAt(head);
            cTail = s.charAt(tail);
            if (!Character.isLetterOrDigit(cHead)) {
                head++;
            } else if (!Character.isLetterOrDigit(cTail)) {
                tail--;
            } else {
                if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                    return false;
                }
                head++;
                tail--;
            }
        }

        return true;
    }
}
