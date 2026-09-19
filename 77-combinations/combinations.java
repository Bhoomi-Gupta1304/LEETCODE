class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        s(n,k,l,ll,1);
        return ll;
    }
    public void s(int n,int k,List<Integer> l,List<List<Integer>> ll, int i){
        if(k==0){
            ll.add(new ArrayList<>(l));
            return;
        }
        for(int j=i;j<=n;j++){
            l.add(j);
            s(n,k-1,l,ll,j+1);
            l.remove(l.size()-1);
        }
    }
}