class Solution {
    public int largestInteger(int n, int s) {
        if(s==0) return 0;
        if(n*9 < s || s>45 ) return -1;
        if(n==1 && s>9) return -1;
        // if(s<10 && n>1) return s * (int)(Math.pow(10,n-1));
        // if(9*n-s < 10) return nn(n) - (9*n - s);
        return num(n,s);
    }
    public int num(int n,int s){
        int y=0;
        while(n>0){
            int z=s-sum(y);
            if(z>=9){
                y= y*10 + 9;
            }
            else{
                y = y*10 + z;
            }
            n--;
        }
        return y;
    }
    public int sum(int n){
        int s = 0 ;
        while(n>0){
            s  += n%10;
            n/=10;
        }
        return s;
    }
    public int nn(int n){
        int s = 0 ;
        while(n>0){
            s = s*10 + 9;
            n--;
        }
        return s;
    }
}
