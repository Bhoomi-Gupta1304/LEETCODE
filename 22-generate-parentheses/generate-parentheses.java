class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ll= new ArrayList<>();
        paran(n,0,0,"",ll);
        return ll;
    }
    public static void paran(int n,int open,int close,String ans,List<String> ll) {
		if(open == n && close==n) {
			ll.add(ans);
			return;
		}
		if(open>n || close>open) {
			return;
		}
		paran(n,open+1,close,ans +"(",ll);
		paran(n,open,close + 1,ans +")",ll);
	}

}