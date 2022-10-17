package ru.zrs.easy;

public class LongestCommonPrefix {

    public static String findLongestCommonPrefix(String[] strs) {

        String commonPrefix = strs[0];
        if (commonPrefix == null || "".equals(commonPrefix)) {
            return "";
        }

        for (int i = 1; i < strs.length; i++) {
            if (strs[i] == null || "".equals(strs[i])) {
                return "";
            }
            while (strs[i].indexOf(commonPrefix) != 0) {
                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
            }
        }

        return commonPrefix;
    }


}
