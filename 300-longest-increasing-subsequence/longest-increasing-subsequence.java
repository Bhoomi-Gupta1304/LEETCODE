class Solution {
    public int lengthOfLIS(int[] nums) {
        return LIS(nums);
    }
    public static int LIS(int [] arr){
        int n=arr.length;
        int[] dp = new int[n];
        dp[0] = arr[0];
        int len = 1;
        for(int i=1;i<dp.length;i++){
            if(dp[len-1]<arr[i]){
                dp[len] = arr[i];
                len++;
            }
            else{
                int idx = BinarySearch(dp,0,len-1,arr[i]);
                dp[idx] = arr[i];
            }
        }
        return len;
    }
    private static int BinarySearch(int[] dp ,int i,int j , int item){
        int ans=0;
        while(i<=j){
            int mid=(i+j)/2;
            if(dp[mid]>=item){
                ans = mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return ans;
    }
}