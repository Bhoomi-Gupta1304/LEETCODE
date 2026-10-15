class Solution {
    public int lengthOfLIS(int[] nums) {
        return LIS(nums);
    }
    public static int LIS(int [] arr){
        int n=arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        for(int i=1;i<dp.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j]<arr[i]){
                    int x = dp[j];
                    dp[i] = Math.max(dp[i],x+1);
                }
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}