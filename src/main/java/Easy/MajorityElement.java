package Easy;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
    /*
    Given an array nums of size n, return the majority element.

    The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
     */
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2,1,1}));
    }

    public static int majorityElement(int[] nums) {

        int maj = nums[0];
        int count = 0;

        for (int i = 0; i < nums.length; i++){
            if (count == 0){
                maj = nums[i];
            }
            if (maj == nums[i]){
                count++;
            }else {
                count--;
            }
        }

        return maj;
    }
}
