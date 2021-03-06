package lc._0011_containerWithMostWater;

public class Solution {

    public int maxArea(int[] height) {
        int res = 0;
        int start = 0;
        int end = height.length - 1;
        while (start < end) {
            res = Math.max(res, (end - start) * Math.min(height[start], height[end]));
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return res;
    }
}
