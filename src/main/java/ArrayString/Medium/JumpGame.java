package ArrayString.Medium;

public class JumpGame {
    /*
    You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

    Return true if you can reach the last index, or false otherwise.
     */
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{3,2,2,0,4}));
    }

    public static boolean canJump(int[] nums) {
        int lastPos = nums.length-1;
        //back-tracking or greedy approach
        for (int i = nums.length-1-1; i >= 0; i--){
            if (i + nums[i] >= lastPos){
                lastPos = i;
            }
        }

        return lastPos == 0;
    }
}
