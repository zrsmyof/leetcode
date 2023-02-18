package ru.zrs.easy;

/**
 * @author zrs
 */
public class AddBinary {

    public String addBinary(String a, String b) {

        StringBuilder resultReverted = new StringBuilder();
        int aIdx = a.length() - 1;
        int bIdx = b.length() - 1;
        int add = 0;
        while (aIdx >= 0 || bIdx >= 0 || add > 0) {
            int cur = add;
            if (aIdx >= 0) {
                cur += Integer.parseInt(a.substring(aIdx, aIdx + 1));
                aIdx--;
            }
            if (bIdx >= 0) {
                cur += Integer.parseInt(b.substring(bIdx, bIdx + 1));
                bIdx--;
            }

            if (cur <= 1) {
                resultReverted.append(cur);
                add = 0;
            } else if (cur == 2) {
                resultReverted.append(0);
                add = 1;
            } else {
                resultReverted.append(1);
                add = 1;
            }
        }
        return resultReverted.reverse().toString();
    }


    public String addBinaryCorrect(String a, String b) {

        StringBuilder resultReverted = new StringBuilder();
        int aIdx = a.length() - 1;
        int bIdx = b.length() - 1;
        int cur = 0;
        while (aIdx >= 0 || bIdx >= 0) {
            if (aIdx >= 0) {
                cur += a.charAt(aIdx--) - '0';
            }
            if (bIdx >= 0) {
                cur += b.charAt(bIdx--) - '0';
            }
            resultReverted.append(cur % 2);
            cur = cur / 2;
        }
        if (cur != 0) {
            resultReverted.append(cur);
        }
        return resultReverted.reverse().toString();
    }
}
