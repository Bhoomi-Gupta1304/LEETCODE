class Solution {
    public int search(int[] nums, int target) {
        return binary(nums,target);
    }
    public static int binary(int[] arr,int k){
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid = l + (h - l) / 2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]<k){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;
    }
}