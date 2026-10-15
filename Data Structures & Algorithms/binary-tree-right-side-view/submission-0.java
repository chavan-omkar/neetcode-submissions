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
    
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null)return new ArrayList<>();

        List<Integer>rightSide = rightSideView(root.right);
        List<Integer>leftSide = rightSideView(root.left);
        
        List<Integer>list = new ArrayList<>();

        list.add(root.val);

        int maxHeight = Math.max(rightSide.size(),leftSide.size());

        for(int i = 0;i<maxHeight;i++){
            if(i < rightSide.size()){
                list.add(rightSide.get(i));
            }else{
                list.add(leftSide.get(i));
            }
        }
        // rightSideView(root.right);
        // rightSideView(root.left);
        return list;
    }
}
