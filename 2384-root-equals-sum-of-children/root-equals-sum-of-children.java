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
    public boolean checkTree(TreeNode root) {
        boolean state = dfs(root);
        return state;
    }
    private static boolean dfs(TreeNode root){
        TreeNode left = root.left;
        TreeNode right = root.right;
        if(root.val == (left.val + right.val)){
            return true;
        }
        return false;
    }
}