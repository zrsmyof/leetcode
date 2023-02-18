package ru.zrs.easy;

/**
 * @author zrs
 */
public class FibonacciNumber {
    /**
     * F(0) = 0, F(1) = 1
     * F(n) = F(n - 1) + F(n - 2), for n > 1.
     */

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int sum = 0;
        int prev1 = 1, prev2 = 0;
        for (int i = 2; i <= n; i++) {
            sum = prev1 + prev2;
            prev2 = prev1;
            prev1 = sum;
        }
        return sum;
    }

    int fibCorrectRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int iteration = 2;
        return calcCorrectRecursive(1, 0, iteration, n);
    }

    int calcCorrectRecursive(int cur, int prev, int iteration, int n) {
        if (iteration > n) {
            return cur;
        }
        int result = cur + prev;
        return calcCorrectRecursive(result, cur, iteration + 1, n);
    }

    int fibSlowRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibSlowRecursive(n - 1) + fibSlowRecursive(n - 2);
    }
}
