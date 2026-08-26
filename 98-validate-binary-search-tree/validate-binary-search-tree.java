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
    public boolean isValidBST(TreeNode root) {
        BSTpair ans = check(root);
        return ans.isbst;
    }
    public BSTpair check(TreeNode root) {
        if (root == null) {
            return new BSTpair();
        }
        BSTpair left = check(root.left);
        BSTpair right = check(root.right);
        BSTpair self = new BSTpair();
        if (!left.isbst || !right.isbst) {
            self.isbst = false;
            return self;
        }
        if (root.val <= left.max || root.val >= right.min) {
            self.isbst = false;
            return self;
        }
        self.min = Math.min(root.val, Math.min(left.min, right.min));
        self.max = Math.max(root.val, Math.max(left.max, right.max));
        return self;
    }
}
class BSTpair {
    boolean isbst = true;
    long min = Long.MAX_VALUE;
    long max = Long.MIN_VALUE;
}