package Stack.Hard;

import java.util.Stack;

public class BasicCalculator {
    /*
    Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation.

    Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().
     */

    public static void main(String[] args) {
        System.out.println(calculate("2-3 - (-3 + (4 + 15)+2)"));
    }



    public static int calculate(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        char[] chars = s.toCharArray();
        int rst = 0;
        int num = 0;
        int sign = 1;
        stack.push(sign);

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                num = num * 10 + (chars[i] - '0');
            } else if (chars[i] == '+' || chars[i] == '-') {
                rst += sign * num;
                sign = stack.peek() * (chars[i] == '+' ? 1 : -1);
                num = 0;
            } else if (chars[i] == '(') {
                stack.push(sign);
            } else if (chars[i] == ')') {
                stack.pop();
            }
        }

        rst += sign * num;
        return rst;

    }
}
