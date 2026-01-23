class Solution {
    public int addDigits(int num) {
        return d(num);
    }
    public static int d(int n) {
		if(n/10==0) {
			return n;
		}
		return d(c(n,0));
	}
	public static int c(int n,int s) {
		if(n==0) {
			return s;
		}
		return c(n/10,s+ (n%10));
	}
}