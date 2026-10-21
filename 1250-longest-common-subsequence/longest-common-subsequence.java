class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int [][] dp = new int[text1.length()+1][text2.length()+1];
        return LCS(text1,text2,dp); //Bottom up approach
    }
    public static int LCS(String s1,String s2,int [][] dp){
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    int f1 = dp[i-1][j];
                    int f2 = dp[i][j-1];
                    dp[i][j] = Math.max(f1,f2);
                }
            }
        }
        return dp[dp.length -1][dp[0].length-1];
    }
}