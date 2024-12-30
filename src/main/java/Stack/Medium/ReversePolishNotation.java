package Stack.Medium;

import java.util.Objects;
import java.util.Stack;

public class ReversePolishNotation {
    /*
    You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

    Evaluate the expression. Return an integer that represents the value of the expression.

    Note that:

    The valid operators are '+', '-', '*', and '/'.
    Each operand may be an integer or another expression.
    The division between two integers always truncates toward zero.
    There will not be any division by zero.
    The input represents a valid arithmetic expression in a reverse polish notation.
    The answer and all the intermediate calculations can be represented in a 32-bit integer.
     */

    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens){
            if (Objects.equals(token, "+") || Objects.equals(token, "-")
                    || Objects.equals(token, "/") || Objects.equals(token, "*")){
                int second = stack.pop();
                int first = stack.pop();
                switch (token){
                    case "+" :
                        stack.push(first + second);
                        break;
                    case "-" :
                        stack.push(first-second);
                        break;
                    case "*" :
                        stack.push(first * second);
                        break;
                    case "/" :
                        stack.push(first / second);
                        break;
                }
            }else{
                stack.push(Integer.valueOf(token));
            }
        }

        return stack.pop();
    }
}
