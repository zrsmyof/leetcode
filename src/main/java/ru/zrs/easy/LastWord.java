package ru.zrs.easy;

public class LastWord {
    public static int lengthOfLastWord(String s) {
        int charCount = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                charCount++;
            } else if (charCount > 0) {
                return charCount;
            }
        }
        return charCount;
    }
}
