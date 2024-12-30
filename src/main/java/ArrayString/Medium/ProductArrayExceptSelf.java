package ArrayString.Medium;

import java.util.Arrays;

public class ProductArrayExceptSelf {
    /*
    Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

    You must write an algorithm that runs in O(n) time and without using the division operation.
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf1(new int[]{1, 2, 3, 4})));
    }


    public static int[] productExceptSelf(int[] nums) {
        int[] leftArr = new int[nums.length];
        int[] rightArr = new int[nums.length];
        int[] output = new int[nums.length];

        leftArr[0] = 1;
        rightArr[nums.length-1]=1;

        for (int i = 1; i < nums.length; i++){
            leftArr[i] = nums[i-1]*leftArr[i-1];
        }

        for (int i = nums.length-2; i >= 0; i--){
            rightArr[i]=nums[i+1]*rightArr[i+1];
        }

        for (int i = 0; i < nums.length; i++){
            output[i] = leftArr[i]*rightArr[i];
        }

        return output;
    }


    public static int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;

        for(int i=1; i<n; i++){
            res[i] = nums[i-1]*res[i-1];
        }

        int prefix = 1;

        for(int i=n-1; i>=0; i--){
            res[i] = res[i]*prefix;
            prefix = prefix*nums[i];
        }

        return res;

    }
}
