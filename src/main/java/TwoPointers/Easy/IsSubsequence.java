package TwoPointers.Easy;

public class IsSubsequence {
    /*
    Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
     */
    public static void main(String[] args) {
        System.out.println(isSubsequence("b","abc"));
    }

    public static boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        if (s.isEmpty())
            return true;
        if (s.length() > t.length())
            return false;
        for (int i = 0; i < t.length() && sIndex < s.length(); i++){
            if (s.charAt(sIndex) == t.charAt(i))
                sIndex++;
        }

        return sIndex == s.length();
    }
}
