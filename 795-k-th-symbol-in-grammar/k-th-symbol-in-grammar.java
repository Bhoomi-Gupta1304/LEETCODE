class Solution {
    public int kthGrammar(int n, int k) {
        return kth(n,k);
    }
    public int kth(int n,int k){
        if(n==1){
            return 0;
        }
        int mid = (int)Math.pow(2, n - 2);
        if(k<=mid){
            return kth(n-1,k);
        }
        return 1 - kth(n-1,k-mid);
    }
}