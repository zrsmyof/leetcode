package ru.zrs.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zrs
 * <p>
 * Дан список интов, повторяющихся элементов в списке нет.
 * Нужно преобразовать это множество в строку, сворачивая соседние по числовому ряду числа в диапазоны.
 * <p>
 * Примеры:
 * [1,4,5,2,3,9,8,11,0] => "0-5,8-9,11"
 * [1,4,3,2] => "1-4"
 * [1,4] => "1,4"
 */
public class CompressString {

    static class IntObj {
        int first = -1;
        int second = -1;

        @Override
        public String toString() {
            return "IntObj{" +
                    "first=" + first +
                    ", second=" + second +
                    '}';
        }
    }

    public String compressOptimizedWithClass(int[] array) {
        if (array == null || array.length == 0) {
            return "";
        }
        if (array.length == 1) {
            return "" + array[0];
        }
        Arrays.sort(array);

        List<IntObj> intervals = new ArrayList<>();
        intervals.add(new IntObj());
        for (int j : array) {
            IntObj interval = intervals.get(intervals.size() - 1);
            if (interval.first == -1) {
                interval.first = j;
            } else if (j - interval.first == 1 || j - interval.second == 1) {
                interval.second = j;
            } else {
                interval = new IntObj();
                interval.first = j;
                intervals.add(interval);
            }
        }
        System.out.println(intervals);

        return intervals.stream().map(l -> l.second == -1
                        ? String.valueOf(l.first)
                        : "" + l.first + "-" + l.second)
                .collect(Collectors.joining(","));
    }

    public String compressOptimized(int[] array) {
        if (array == null || array.length == 0) {
            return "";
        }
        if (array.length == 1) {
            return "" + array[0];
        }
        Arrays.sort(array);

        List<List<Integer>> intervals = new ArrayList<>();
        intervals.add(new ArrayList<>());
        for (int j : array) {
            List<Integer> interval = intervals.get(intervals.size() - 1);
            if (interval.isEmpty()) {
                interval.add(j);
            } else if (j - interval.get(interval.size() - 1) == 1) {
                if (interval.size() == 1) {
                    interval.add(j);
                } else {
                    interval.set(1, j);
                }
            } else {
                interval = new ArrayList<>();
                interval.add(j);
                intervals.add(interval);
            }
        }
        System.out.println(intervals);

        return intervals.stream().map(l -> l.size() == 1
                        ? String.valueOf(l.get(0))
                        : "" + l.get(0) + "-" + l.get(1))
                .collect(Collectors.joining(","));
    }

    public String compress(int[] array) {
        if (array == null || array.length == 0) {
            return "";
        }
        if (array.length == 1) {
            return "" + array[0];
        }
        StringBuilder builder = new StringBuilder();
        Arrays.sort(array);
        builder.append(array[0]);
        int first = array[0];
        int prev = first;

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            if (current - prev > 1) {
                if (prev > first) {
                    builder.append("-").append(prev).append(",").append(current);
                } else {
                    builder.append(",").append(current);
                }
                first = current;
            } else if (i == array.length - 1) {
                builder.append("-").append(current);
            }
            prev = current;
        }
        return builder.toString();
    }
}
