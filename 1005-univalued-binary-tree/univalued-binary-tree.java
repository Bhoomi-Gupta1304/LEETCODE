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
    public boolean isUnivalTree(TreeNode root) {
        return is(root);
    }
    public boolean is(TreeNode root){
        if(root == null){
            return true;
        }
        int x = root.val;
        if(root.left == null && root.right==null){
            return true;
        }
        if(root.left !=null && root.left.val !=x){
            return false;
        }
        if(root.right !=null && root.right.val !=x){
            return false;
        }
        
        return (is(root.left) && is(root.right));
    }
}