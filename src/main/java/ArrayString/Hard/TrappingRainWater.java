package ArrayString.Hard;

public class TrappingRainWater {
    /*
    Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
     */

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    public static int trap(int[] height) {
        if (height.length <= 2) return 0;

        int maxLeft = height[0];
        int maxRight = height[height.length-1];

        int left = 0;
        int right = height.length-1;
        int sum = 0;

        while (left < right){
            int curIndex;
            if (maxLeft <= maxRight) {
                curIndex = left;
                if (height[curIndex] > maxLeft)
                    maxLeft = height[curIndex];
            }else {
                curIndex = right;
                if (height[curIndex] > maxRight)
                    maxRight = height[curIndex];
            }
            int currentSum =  Integer.min(maxLeft,maxRight)-height[curIndex];
            if (currentSum > 0) sum += currentSum;

            if (maxLeft <= maxRight)
                left++;
            else
                right--;
        }

        return sum;
    }
}
