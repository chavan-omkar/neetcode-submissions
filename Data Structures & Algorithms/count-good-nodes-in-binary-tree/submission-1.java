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
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val, 0);
    }

    private int dfs(TreeNode root, int val, int goodNodeCount) {
        if (root == null)
            return goodNodeCount;

        
        if (root.val >= val) {
            
            val = root.val;
            goodNodeCount++;
        }

        goodNodeCount = dfs(root.left, val,goodNodeCount );
        goodNodeCount = dfs(root.right, val,goodNodeCount);

        return goodNodeCount;
    }
}
