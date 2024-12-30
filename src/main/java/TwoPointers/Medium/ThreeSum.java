package TwoPointers.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeSum {
    /*
    Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
     */

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,0}));
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++){
            if (i > 0 && nums[i]==nums[i-1])
                continue;
            int left = i+1;
            int right = nums.length-1;
            int sum = 0-nums[i];

            while (left<right){
                if (nums[left] + nums[right]<sum)
                    left++;
                else if (nums[left] + nums[right] > sum)
                    right--;
                else{
                    triplets.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (left < right && nums[left]==nums[left+1])
                        left++;
                    while (left < right && nums[right]==nums[right-1])
                        right--;
                    left++;
                    right--;
                }
            }
        }
        return triplets;
    }
}
