package ru.zrs.easy;

import java.util.Map;

public class RomanToInteger {

    private static Map<Character, Integer> romanIntMap = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public static int convertRomanToInteger(String romanNumber) {
        int intNumber = 0;
        char[] romanArray = romanNumber.toCharArray();
        for (int i = 0; i < romanArray.length; i++) {
            if (i == romanArray.length - 1 || romanIntMap.get(romanArray[i]) >= romanIntMap.get(romanArray[i + 1])) {
                intNumber += romanIntMap.get(romanArray[i]);
            } else {
                intNumber = intNumber + romanIntMap.get(romanArray[i + 1]) - romanIntMap.get(romanArray[i]);
                i++;
            }
        }
        return intNumber;
    }
}
