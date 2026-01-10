class Solution {
    public int searchInsert(int[] nums, int target) {
        return binary(nums,target);
    }
    public static int binary(int [] arr,int k){
        int lo=0;
        int hi=arr.length-1;
        int mid=0;
        while(lo<=hi){
            mid=(lo+hi)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]<k){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        if(arr[mid]<k){
            return mid+1;
        }
        else{
            return mid;
        }
    }
}