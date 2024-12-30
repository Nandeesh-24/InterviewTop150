package TwoPointers.Easy;

public class ValidPalindrome {
    /*
    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

    Given a string s, return true if it is a palindrome, or false otherwise.
     */
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a cana: Panama"));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");
        char[] chars= s.toCharArray();
        for (int i = 0; i < chars.length/2; i++){
            if (chars[i] != chars[chars.length-1-i])
                return false;
        }
        return true;
    }
}
