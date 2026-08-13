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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return path(root,targetSum);
    }
    public boolean path(TreeNode root,int k){
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            return k == root.val;
        }
        k=k-root.val;
        return path(root.left,k) || path(root.right,k);
    }
}