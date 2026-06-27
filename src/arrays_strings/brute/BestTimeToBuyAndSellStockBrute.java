package arrays_strings.brute;

// Problem: Best Time to Buy and Sell Stock
// Approach: Brute Force - Check all pairs
// Time Complexity: O(n^2)
// Space Complexity: O(1)

public class BestTimeToBuyAndSellStockBrute {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        // Check every pair of buy and sell days
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {

                // Calculate profit if we buy on day i and sell on day j
                int profit = prices[j] - prices[i];

                // Update max profit if this is better
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockBrute sol = new BestTimeToBuyAndSellStockBrute();
        System.out.println(sol.maxProfit(new int[]{7, 1, 5, 3, 6, 4})); // Output: 5
        System.out.println(sol.maxProfit(new int[]{7, 6, 4, 3, 1}));    // Output: 0
    }
}