class Solution {
    public int sumOfSquares(int[] nums) {
        return sum(nums);
    }
    public static int sum(int[] arr){
        int s=0;
        int n=arr.length;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                s += (Math.pow(arr[i-1],2));
            }
        }
        return s;
    }
}