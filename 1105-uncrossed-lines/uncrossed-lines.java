class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int [][] dp = new int[nums1.length+1][nums2.length+1];
        return line(nums1,nums2,dp);
    }
    public static int line(int [] arr1,int [] arr2,int [][] dp){
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(arr1[i-1]==arr2[j-1]){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    int f1 = dp[i-1][j];
                    int f2 = dp[i][j-1];
                    dp[i][j] = Math.max(f1,f2);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}