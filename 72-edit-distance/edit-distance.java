class Solution {
    public int minDistance(String word1, String word2) {
        int [][] dp = new int[word1.length()+1][word2.length()+1];
        return Min_Ops(word1,word2,dp);
    }
    public static int Min_Ops(String s,String t,int [][] dp){ //bottom - up approach
    // Base cases
    int m=dp.length-1;
    int n=dp[0].length-1;
        for (int i = 0; i <= m; i++) {
            dp[i][n] = m - i;
        }
        for (int j = 0; j <= n; j++) {
            dp[m][j] = n - j;
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i][j] = dp[i + 1][j + 1];
                } 
                else {
                    int D = dp[i + 1][j];     // Delete
                    int R = dp[i + 1][j + 1]; // Replace
                    int I = dp[i][j + 1];     // Insert
                    dp[i][j] = Math.min(D, Math.min(R, I)) + 1;
                }
            }   
        }
        return dp[0][0];
    }
}