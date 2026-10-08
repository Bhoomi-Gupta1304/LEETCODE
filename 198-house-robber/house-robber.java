class Solution {
    public int rob(int[] nums) {
        int [] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return Robber2(nums,nums.length-1,dp);
    }
    public static int Robber2(int [] arr,int i,int [] dp){
        if(i<0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int rob = arr[i]+ Robber2(arr,i-2,dp);
        int dont_rob = Robber2(arr,i-1,dp);
        return dp[i]=Math.max(rob,dont_rob);

    }
    // public static int Robber(int [] arr,int i,int [] dp){
    //     if(i>=arr.length){
    //         return 0;
    //     }
    //     if(dp[i]!=-1){
    //         return dp[i];
    //     }
    //     int rob = arr[i]+ Robber(arr,i+2,dp);
    //     int dont_rob = Robber(arr,i+1,dp);
    //     return dp[i]=Math.max(rob,dont_rob);

    // }
    
}