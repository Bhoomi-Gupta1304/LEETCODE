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

    public boolean isBalanced(TreeNode root) {
        BalPair bp = Balanced(root);
        return bp.isBal;
    }

    public BalPair Balanced(TreeNode root) {
        if (root == null) {
            return new BalPair();
        }
        BalPair lp = Balanced(root.left);
        BalPair rp = Balanced(root.right);
        BalPair sp = new BalPair();
        sp.ht = Math.max(lp.ht, rp.ht) + 1;
        sp.isBal = lp.isBal &&
                   rp.isBal &&
                   Math.abs(lp.ht - rp.ht) <= 1;
        return sp;
    }
}

class BalPair {
    boolean isBal = true;
    int ht = -1;
}
