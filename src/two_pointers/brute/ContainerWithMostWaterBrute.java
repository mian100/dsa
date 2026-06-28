package two_pointers.brute;

// Problem: Container With Most Water
// Approach: Brute Force - Check all pairs of heights
// Time Complexity: O(n^2)
// Space Complexity: O(1)

public class ContainerWithMostWaterBrute {

    public int maxArea(int[] height) {
        int maxWater = 0;

        // Check every pair
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {

                // Water = shorter height * distance
                int water = Math.min(height[i], height[j]) * (j - i);
                maxWater = Math.max(maxWater, water);
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ContainerWithMostWaterBrute sol = new ContainerWithMostWaterBrute();
        System.out.println(sol.maxArea(new int[]{1,8,6,2,5,4,8,3,7})); // 49
    }
}