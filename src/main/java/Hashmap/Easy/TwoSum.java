package Hashmap.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,3,7,11,15},9)));
    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> diffMap = new HashMap<>();// diff:index

        for (int i = 0; i < nums.length; i++){
            int diff = target-nums[i];

            if (diffMap.containsKey(diff)){
                return new int[]{diffMap.get(diff),i};
            }

            diffMap.put(nums[i],i);
        }

        return new int[2];

    }
}
