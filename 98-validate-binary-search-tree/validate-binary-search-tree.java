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

        // Empty tree is a valid BST
        if (root == null) {
            return new BSTpair();
        }

        // Get information from left and right subtree
        BSTpair left = check(root.left);
        BSTpair right = check(root.right);

        BSTpair self = new BSTpair();

        // Check if left or right subtree is already invalid
        if (!left.isbst || !right.isbst) {
            self.isbst = false;
            return self;
        }

        // Check BST property
        if (root.val <= left.max || root.val >= right.min) {
            self.isbst = false;
            return self;
        }

        // Calculate min
        self.min = Math.min(root.val, Math.min(left.min, right.min));

        // Calculate max
        self.max = Math.max(root.val, Math.max(left.max, right.max));

        return self;
    }
}
class BSTpair {
    boolean isbst = true;
    long min = Long.MAX_VALUE;
    long max = Long.MIN_VALUE;
}