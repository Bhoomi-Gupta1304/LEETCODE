class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int [][] dp =new int[dungeon.length][dungeon[0].length];
        return min(dungeon,0,0,dp);
    }
    public static int min(int [][] arr,int cr,int cc,int [][] dp){
        if(cr>=arr.length || cc>=arr[0].length){
            return Integer.MAX_VALUE;
        }
        if(cr==arr.length-1 && cc==arr[0].length-1){
            return Math.max(1, 1-arr[cr][cc]);
        }
        if(dp[cr][cc] != 0){
            return dp[cr][cc];
        }
        int ld = min(arr,cr,cc+1,dp);
        int rd = min(arr,cr+1,cc,dp);
        int hp = Math.min(ld,rd)- arr[cr][cc];
        return dp[cr][cc] = hp>0 ? hp : 1;
    }
}