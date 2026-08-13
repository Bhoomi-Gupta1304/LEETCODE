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
    public TreeNode bstToGst(TreeNode root) {
        bst(root,0);
        return root;
    }
    public int bst(TreeNode root,int sum){
        if(root == null){
            return sum;
        }
        sum=bst(root.right,sum);
        sum+=root.val;
        root.val = sum;
        
        return bst(root.left,sum);
    }
}