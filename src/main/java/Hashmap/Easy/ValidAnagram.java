package Hashmap.Easy;

import java.util.HashMap;

public class ValidAnagram {
    /*
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.

    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.


     */

    public static void main(String[] args) {
        System.out.println(isAnagram("ac","bb"));
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++){
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }

        for (char key : map1.keySet()){
            if (map2.containsKey(key)) {
                if (map1.get(key).intValue() != map2.get(key).intValue()) return false;
            }else
                return false;
        }
        return true;
    }
}
