package ArrayString.Medium;

import java.util.Arrays;

public class RotateArray {
    /*
    Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
     */
    public static void main(String[] args) {
        rotate(new int[]{-1,-100,3,99},2);
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int start, int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


}
