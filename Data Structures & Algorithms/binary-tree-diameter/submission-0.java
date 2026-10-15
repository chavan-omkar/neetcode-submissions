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
    private int maxDia = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        calculateHeights(root);
        return maxDia;
    }

    private int calculateHeights(TreeNode root){
        if(root == null) return 0;

        int leftHeight = calculateHeights(root.left);
        int rightHeight = calculateHeights(root.right);

        maxDia = Math.max(maxDia,leftHeight+rightHeight);
        return Math.max(leftHeight,rightHeight)+1;
    }
}
