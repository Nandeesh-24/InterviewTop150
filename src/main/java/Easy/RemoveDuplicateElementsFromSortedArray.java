package Easy;

import java.util.Arrays;

public class RemoveDuplicateElementsFromSortedArray {
    /*
    Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

    Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

    Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
    Return k.
     */

    public static void main(String[] args) {
        System.out.println(removeDuplicateElement(new int[]{1,2,2,3,4}));
    }

    public static int removeDuplicateElement(int[] nums) {
        int pos = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i-1] != nums[i]){
                nums[pos] = nums[i];
                pos++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return pos;
    }
}
