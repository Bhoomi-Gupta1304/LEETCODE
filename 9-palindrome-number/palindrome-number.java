class Solution {
    public boolean isPalindrome(int x) {
        return is(x);
    }
    public static boolean is(int x){
        if(x<0){
            return false;
        }
        else{
            int y=x;
            int s=0;
            while(y!=0){
                int rem=y%10;
                s=s*10 + rem;
                y/=10;
            }
            if(x==s){
                return true;
            }
            else{
                return false;
            }
        }
    }
}