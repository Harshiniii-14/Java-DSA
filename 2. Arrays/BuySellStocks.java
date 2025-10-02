public class BuySellStocks {
    public static int buyAndSellStocks(int prices[]) {
        // Track the lowest buy price found so far. Initialize high to capture the first day's price.
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // Iterate through the prices once.
        for (int i = 0; i < prices.length; i++) {
            // If the current price is higher than our buy price, it's a chance to profit.
            if (buyPrice < prices[i]) {
                // Calculate profit if sold today and update maxProfit if it's a new high.
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
                System.out.println(profit);
            } else {
                // If the current price is lower, it's a new best time to buy.
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4}; // Expected profit: 5 (buy at 1, sell at 6)
        System.out.println("The maximum profit attainable is " + buyAndSellStocks(prices) + ".");
    }
}

/**
- 1- int_max > 7, so else is triggered, set buyprice = 7
- 2- P = 1, BP = 7, Profit = -6 -> 7 > 1 so else triggered, set buyprice = 1
- 3- P = 5, BP = 1, Profit = 4 (max profit) -> 1 < 5 so 'if' condition is triggered
- 4- P = 3, BP = 1, Profit = 2
- 5- P = 6, BP = 1, Profit = 5 (new max profit as 5 > 4)
- 6- P - 4, BP = 1, Profit = 1
**/