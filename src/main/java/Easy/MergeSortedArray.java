package Easy;

import java.util.Arrays;

public class MergeSortedArray {
    /*
    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

    Merge nums1 and nums2 into a single array sorted in non-decreasing order.

    The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n
     */

    public static void main(String[] args) {
        merge(new int[]{0},0,new int[]{1},1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int last1 = m-1;
        int last2 = n-1;
        for (int i = m+n-1; i >= 0; i--){
            if(last2 >= 0 ){
                if(last1>=0 && nums1[last1] > nums2[last2]){
                    nums1[i] = nums1[last1];
                    last1--;
                }else{
                    nums1[i] = nums2[last2];
                    last2--;
                }
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
