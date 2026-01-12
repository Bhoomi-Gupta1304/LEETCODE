class Solution {
    public int removeElement(int[] nums, int val) {
        return s(nums,val);
    }
    public static int s(int[] arr,int k){
        int x=0;
        int i=0;
        int j=arr.length - 1;
        while(i<=j){
            if(arr[i]==k){
                for(int y=i;y<j;y++){
                    arr[y]=arr[y+1];
                }
                x++;
                j--;
                i--;
            }
            i++;
        }
        return arr.length - x;}
}