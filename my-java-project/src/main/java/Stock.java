public class Stock {
    public static int maxProfit(int[] prices) {
        int left = 0; 
        int right = 1; 
        int profit = 0;

        if (prices.length > 1) {
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < prices[left]) {
                    left = i;
                } else {
                    int currentProfit = prices[i] - prices[left];
                    if (currentProfit > profit) {
                        profit = currentProfit;
                        right = i;
                    }
                }
            }
            return profit;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] abc = {2, 1, 2, 1, 0, 1, 2};
        System.out.println("Max Profit: " + maxProfit(abc));
    }
}
