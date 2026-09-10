class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> l= new ArrayList<>();
        List<List<Integer>> ll = new ArrayList<>();
        s(nums,l,ll,0);
        return ll;
    }
    public void s(int [] arr,List<Integer> l,List<List<Integer>> ll,int i){
        if(i==arr.length){
            ll.add(new ArrayList<>(l));
            return;
        }
        l.add(arr[i]);
        s(arr,l,ll,i+1);
        l.remove(l.size()-1);
        s(arr,l,ll,i+1);
    }
}