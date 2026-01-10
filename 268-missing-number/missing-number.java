class Solution {
    public int missingNumber(int[] nums) {
        return m(nums);
    }
    public static int m(int [] arr){
        Arrays.sort(arr);
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return i;
    }
}