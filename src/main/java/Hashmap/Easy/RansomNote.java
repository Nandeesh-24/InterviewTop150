package Hashmap.Easy;

import java.util.HashMap;

public class RansomNote {
    /*
    Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

    Each letter in magazine can only be used once in ransomNote.
     */

    public static void main(String[] args) {
        System.out.println(canConstruct("aa","ab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        if (ransomNote.length() > magazine.length()) return false;

        for (int i = 0; i < ransomNote.length(); i++){
            map1.put(ransomNote.charAt(i),map1.getOrDefault(ransomNote.charAt(i),0)+1);
        }

        for (int i = 0; i < magazine.length(); i++){
            map2.put(magazine.charAt(i),map2.getOrDefault(magazine.charAt(i),0)+1);
        }

        for (char key : map1.keySet()){
            if (map2.containsKey(key)) {
                if (map1.get(key).intValue() > map2.get(key).intValue()) return false;
            }else
                return false;
        }

        return true;
    }
}
