class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return Coin(coins, amount, 0, dp);
    }
    public int Coin(int[] coins, int amount, int i, int[][] dp) {
        if (amount == 0) {
            return 1;
        }
        if (i == coins.length) {
            return 0;
        }
        if (dp[i][amount] != -1) {
            return dp[i][amount];
        }
        int inc = 0;
        int exc = 0;
        if (coins[i] <= amount) {
            inc = Coin(coins, amount - coins[i], i, dp);
        }
        exc = Coin(coins, amount, i + 1, dp);
        return dp[i][amount] = inc + exc;
    }
}