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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int z = height(root.left)+height(root.right);
        int x = diameterOfBinaryTree(root.left);
        int y = diameterOfBinaryTree(root.right);
        return Math.max(z,Math.max(x,y));
    }
    public static int height(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right)) + 1;
    }
}