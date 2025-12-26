class Solution {
    public int[] twoSum(int[] nums, int target) {
        return sum(nums,target);
    }
    public static int[] sum(int [] arr,int  k){
        int [] arr2= new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    arr2[0]=i;
                    arr2[1]=j;
                    break;
                }
            }
        }
        return arr2;
    }
}