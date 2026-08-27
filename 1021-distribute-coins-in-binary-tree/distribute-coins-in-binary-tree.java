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
    public int distributeCoins(TreeNode root) {
        // ya too uss move ko extra coin chahie hoga ya uske pass extra coin hoga ya fr usko jrurt hogi
        // we'll see left side how many coins are extra
        Pair ans = distribute(root);
        return ans.count;
    }
    public Pair distribute(TreeNode root) {
        if(root == null) {
            return new Pair();
        }
        Pair lp = distribute(root.left);
        Pair rp = distribute(root.right);
        Pair sp = new Pair();
        // Total moves in left + right subtree
        // + moves needed across left and right edges
        sp.count = lp.count + rp.count
                + Math.abs(lp.need)
                + Math.abs(rp.need);
        // Extra (+) or required (-) coins in this subtree
        sp.need = lp.need + rp.need + root.val - 1;
        return sp;
    }
    class Pair {
        int count = 0;
        int need = 0;
    }
}