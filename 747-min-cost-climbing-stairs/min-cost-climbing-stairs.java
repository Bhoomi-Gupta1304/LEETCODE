class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);
        int zero = min(cost, 0, dp);
        int one = min(cost, 1, dp);
        return Math.min(zero, one);
    }
    public static int min(int[] cost, int i, int[] dp) {
        if (i >= cost.length) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int f = min(cost, i + 1, dp);
        int s = min(cost, i + 2, dp);
        return dp[i] = Math.min(f, s) + cost[i];
    }
}