package leetcode.daily_question;

/*
633. Sum of Square Numbers (Medium)
Given a non-negative integer c, decide whether there are two integers a and b such that a2 + b2 = c.

Example 1:
Input: c = 5
Output: true
Explanation: 1 * 1 + 2 * 2 = 5

Example 2:
Input: c = 3
Output: false
*/
public class SumOfSquareNumbers {
    public static void main(String[] args) {
        int x = 13;
        int y = 14;

        System.out.println(judgeSquareSum(x)); // true
        System.out.println(judgeSquareSum(y)); // false
        System.out.println();
        System.out.println(judgeSquareSum2(x)); // true
        System.out.println(judgeSquareSum2(y)); // false
    }

    public static boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            for (long b = 0; b * b <= c; b++) {
                if (a * a + b * b == c)
                    return true;
            }
        }
        return false;
    }

    public static boolean judgeSquareSum2(int c) {
        int a = 0;
        int b = c * c;
        while (a <= b) {
            int sum = a * a + b * b;
            if (sum == c)
                return true;
            else if (sum > c)
                b--;
            else
                a++;
        }
        return false;
    }
}
