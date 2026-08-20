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
        DiaPair dp = diameter(root);
        return dp.dia;
    }
    public DiaPair diameter(TreeNode root){
        // Base case
        if (root == null) {
            return new DiaPair();
        }
        DiaPair ldp = diameter(root.left);
        DiaPair rdp = diameter(root.right);
        int sd = ldp.ht + rdp.ht + 2; //
        DiaPair sdp = new DiaPair();
        sdp.ht = Math.max(ldp.ht, rdp.ht) +1 ; // pure tree ki height
        sdp.dia = Math.max(sd,Math.max(ldp.dia,rdp.dia)); //pure tree ka diameter or height ka maximum
        return sdp;
    }
}
class DiaPair {
    int dia = 0;
    int ht=-1;
}