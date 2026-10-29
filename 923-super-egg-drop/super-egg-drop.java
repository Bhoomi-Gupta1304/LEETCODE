class Solution {
    public int superEggDrop(int k, int n) {
        int [][] dp = new int[n+1][k+1];
        for(int []a : dp){
            Arrays.fill(a,-1);
        }
        return egg(n,k,dp);
    }
    public static int egg(int n, int e,int [][] dp){
        if(n==0||n==1||e==1){
            return n;
        }
        if(dp[n][e]!=-1){
            return dp[n][e];
        }
        int ans = Integer.MAX_VALUE;
        // for(int f=0;f<=n;f++){
        int lo = 1;
        int hi=n;
        while(lo<=hi){
            int f = (lo+hi)/2;
            int b = egg(f-1,e-1,dp);
            int ub = egg(n-f,e,dp);
            int t = Math.max(b,ub)+1;
            ans = Math.min(ans,t);
            if(b<ub){
                lo=f+1;
            }
            else{
                hi=f-1;
            }
        }
        return dp[n][e] = ans;
    }
}