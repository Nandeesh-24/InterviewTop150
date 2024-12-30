package ArrayString.Easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    /*
    Write a function to find the longest common prefix string amongst an array of strings.

    If there is no common prefix, return an empty string "".
     */

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        int i = 0;
        Arrays.sort(strs);

        String s1 = strs[0];
        String s2 = strs[strs.length-1];

        while (i < s1.length() && i < s2.length()){
            if (s1.charAt(i) == s2.charAt(i))
                i++;
            else
                break;
        }

        return s1.substring(0,i);
    }

}
