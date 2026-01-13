class Solution {
    public boolean search(int[] nums, int target) {
        return s(nums,target);
    }
    public static boolean s(int[] arr,int k){
        
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==k){
                return true;
            }
            if (arr[mid] == arr[i]) {
                i++;
                continue;
            }
            
            if (arr[i] <= arr[mid]) {
                if (arr[i] <= k && k < arr[mid]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            } else {
                if (arr[mid] < k && k<= arr[j]) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }
        }
        return false;
    }

}