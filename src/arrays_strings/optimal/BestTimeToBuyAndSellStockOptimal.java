package arrays_strings.optimal;

// Problem: Best Time to Buy and Sell Stock
// Approach: Optimal - Track running minimum price
// Time Complexity: O(n)
// Space Complexity: O(1)

public class BestTimeToBuyAndSellStockOptimal {

    public int maxProfit(int[] prices) {
        int minPrice = prices[0];  // Track lowest buy price
        int maxProfit = 0;         // Track maximum profit

        for (int i = 1; i < prices.length; i++) {

            // If current price is lower, update minimum buy price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate profit if we sell today
            int profit = prices[i] - minPrice;

            // Update max profit if this is better
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockOptimal sol = new BestTimeToBuyAndSellStockOptimal();
        System.out.println(sol.maxProfit(new int[]{7, 1, 5, 3, 6, 4})); // Output: 5
        System.out.println(sol.maxProfit(new int[]{7, 6, 4, 3, 1}));    // Output: 0
    }
}