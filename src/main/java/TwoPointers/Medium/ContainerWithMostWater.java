package TwoPointers.Medium;

public class ContainerWithMostWater {
    /*
    You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
     */
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int area = 0;
        while (start < end){
            int currentArea = Integer.min(height[start],height[end])*(end-start);
            area = Integer.max(area,currentArea);
            if (height[start] < height[end])
                start++;
            else
                end--;
        }

        return area;

    }
}
