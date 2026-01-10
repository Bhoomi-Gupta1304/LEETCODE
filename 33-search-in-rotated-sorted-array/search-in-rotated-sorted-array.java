class Solution {
    public int search(int[] nums, int target) {
        return binary(nums,target);
    }
    public static int binary(int [] arr,int k){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[low]<=arr[mid]){
                if(arr[low]<=k && arr[mid]>k){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(arr[high]>=k && arr[mid]<k){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}