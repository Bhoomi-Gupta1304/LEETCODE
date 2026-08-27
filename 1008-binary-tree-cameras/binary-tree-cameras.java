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
    int camera = 0;
    public int minCameraCover(TreeNode root) {
        int x = camera(root);
        if(x==-1){
            camera++;
        }
        return camera;
    }
    public int camera(TreeNode root){
        if(root == null){
            return 0; //covered
        }
        int left = camera(root.left);
        int right = camera(root.right);
        if(left == -1 || right == -1){
            camera++;
            return 1; // has a camera 
        }
        else if(left == 1 || right == 1){
            return 0; // already covered 
        }
        else{
            return -1;
        }
    }
}