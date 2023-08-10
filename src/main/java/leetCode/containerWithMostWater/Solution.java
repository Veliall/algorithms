package leetCode.containerWithMostWater;

public class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int area = 0;
            if (height[left] <= height[right]) {
                area = (right - left) * height[left];
                left++;
            } else {
                area = (right - left) * height[right];
                right--;
            }

            if (area > maxArea) maxArea = area;
        }
        return maxArea;
    }
}
