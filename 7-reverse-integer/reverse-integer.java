class Solution {
    public int reverse(int x) {
        return reverse1(x);
    }
    public static int reverse1(int n) {
		if(n>=(-Math.pow(2,31)) && n<=(Math.pow(2, 31)-1)) {
			int m=n;
			if(n<0) {
				m=n*(-1);
			}
			long rem=0;
			while(m>0) {
				rem= rem*10 + m%10;
				m/=10;
			}
			if(n>0) {
                if(rem>=(-Math.pow(2,31)) && rem<=(Math.pow(2, 31)-1)){
                	rem= (int) (rem);
                    return (int) (rem);
                }
				else{
                    return 0;
                }
			}
			else {
                if(rem>=(-Math.pow(2,31)) && rem<=(Math.pow(2, 31)-1)){
                	rem= (int) (rem);
                    return (int) ((-1)*rem);
                }
				else{
                    return 0;
                }
			}
		}
		else {
			return 0;
		}
	}
}