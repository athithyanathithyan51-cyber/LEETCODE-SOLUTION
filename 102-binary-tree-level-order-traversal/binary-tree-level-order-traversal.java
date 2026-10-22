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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> al = new ArrayList<>();
        dfs(root,0,al);
        return al;
    }
    private void dfs(TreeNode root,int level,List<List<Integer>> al){
        if(root == null){
            return;
        }
        if(level == al.size()){
            al.add(new ArrayList<>());
        }
        al.get(level).add(root.val);
        dfs(root.left,level+1,al);
        dfs(root.right,level+1,al);
    }
}