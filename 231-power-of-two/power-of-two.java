class Solution {
    public boolean isPowerOfTwo(int n) {
        return is(n);
    }
    public boolean is(int n){
        if(n==1){
            return true;
        }
        if(n%2!=0 || n==0){
            return false;
        }
        return is(n/2);
    }
}