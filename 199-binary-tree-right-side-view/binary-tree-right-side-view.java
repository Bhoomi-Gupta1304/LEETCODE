/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max_depth = 0;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        if (root == null) {
            return ll;
        }
        
        ll.add(root.val);
        rsv(root, ll, 0);
        return ll;
    }
    public void rsv(TreeNode root, List<Integer> ll,int d){
        if(root == null){
            return;
        }
        if(max_depth < d){
            max_depth = d;
            ll.add(root.val);
        }
        rsv(root.right,ll,d+1);
        rsv(root.left,ll,d+1);
    }
}