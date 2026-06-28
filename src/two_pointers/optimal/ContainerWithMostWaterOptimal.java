package two_pointers.optimal;

// Problem: Container With Most Water
// Approach: Optimal - Two pointers, always move shorter side
// Time Complexity: O(n)
// Space Complexity: O(1)

public class ContainerWithMostWaterOptimal {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            // Calculate current water
            int water = Math.min(height[left], height[right]) * (right - left);
            maxWater = Math.max(maxWater, water);

            // Move the shorter side inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ContainerWithMostWaterOptimal sol = new ContainerWithMostWaterOptimal();
        System.out.println(sol.maxArea(new int[]{1,8,6,2,5,4,8,3,7})); // 49
    }
}
