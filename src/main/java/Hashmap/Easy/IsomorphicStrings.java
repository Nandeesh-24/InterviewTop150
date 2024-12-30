package Hashmap.Easy;

import java.util.HashMap;

public class IsomorphicStrings {
    /*
    Given two strings s and t, determine if they are isomorphic.

    Two strings s and t are isomorphic if the characters in s can be replaced to get t.

    All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
     */
    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc","baba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (map1.containsKey(c1)){
                if (c2 == map1.get(c1)) continue;
                else return false;
            } else if (map2.containsKey(c2)) {
                if (c1 == map2.get(c2)) continue;
                else return false;
            }

            map1.put(c1,c2);
            map2.put(c2,c1);
        }


        return true;
    }
}
