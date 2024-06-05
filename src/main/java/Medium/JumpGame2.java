package Medium;

public class JumpGame2 {
    /*
    You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].

    Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:

    0 <= j <= nums[i] and
    i + j < n
    Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].
     */

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{4,1,1,3,1,1,1}));
    }

    public static int canJump(int[] nums) {
        int steps = 0;
        int r = 0;
        int l = 0;

        while(r < nums.length-1) {
            int farthest = 0;
            for (int i = l; i <= r; i++){
                farthest = Integer.max(farthest, i + nums[i]);
            }

            l = r+1;
            r = farthest;
            steps++;
        }

        return steps;
    }
}
