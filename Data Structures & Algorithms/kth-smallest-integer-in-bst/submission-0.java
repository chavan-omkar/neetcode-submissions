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
    private int cnt =0;
    private int result = -1; 
    public int kthSmallest(TreeNode root, int k) {
        dfs(root,k);
         return result;
    }

    private void dfs(TreeNode root, int k){
        if(root == null || cnt >= k){
            return ;
        }

        dfs(root.left,k);

        cnt++;

        if(cnt == k){
            result = root.val;
            return ;
        }

        
        dfs(root.right,k);

        
    }
}
