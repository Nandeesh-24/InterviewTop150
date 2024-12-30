package Stack.Easy;

import java.util.Stack;

public class ValidParentheses {
    /*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.
     */
    static char[][] tokens = new char[][]{{'{','}'},{'[',']'},{'(',')'}};

    public static void main(String[] args) {
        System.out.println(isValid("()[]{[}"));
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if (isOpen(c)){
                stack.push(c);
            }else{
                if (stack.isEmpty() || !matches(stack.pop(), c))
                    return false;
            }
        }

        return stack.isEmpty();
    }

    public static boolean isOpen(char c){
        for (char[] token : tokens){
            if (token[0] == c)
                return true;
        }
        return false;
    }

    public static boolean matches(char open, char close){
        for (char token[] : tokens){
            if (token[0] == open){
                return token[1] == close;
            }
        }
        return false;
    }
}
