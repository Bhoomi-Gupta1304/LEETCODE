class Solution {
    public int mySqrt(int x) {
        return b(x);
    }
    public static int b(int x){
        int lo=0;
        int hi=x/2;
        if(x==1){
            return 1;
        }
        while(lo<=hi){
            int mid=lo+(hi-lo)/2; 
            long s=(long) mid*mid;
            if(s == x){
                return mid;
            }
            else if(s>x){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return hi;
    }

}