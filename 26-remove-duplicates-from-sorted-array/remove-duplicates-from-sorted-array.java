class Solution {
    public int removeDuplicates(int[] nums) {
        return b(nums);
    }
    public static int b(int[] arr){
        int k=0;
        for(int i=1,j=arr.length;i<j;i++){
            if(arr[i]==arr[i-1]){
                for(int x=i;x<j-1;x++){
                    arr[x]=arr[x+1];
                }
                j--;
                i--;
                k++;
            }
        }
        return arr.length - k;
    }
}