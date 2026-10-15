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
        List<Integer>list = new ArrayList<>();

        if(root == null)return list;

        Queue<TreeNode>que = new ArrayDeque<>();
        que.offer(root);

        while(!que.isEmpty()){
            int n = que.size();
            

            for(int i = 0;i<n;i++){
                TreeNode curr = que.poll();
                if(i == 0) list.add(curr.val);
                if(curr.right != null) que.offer(curr.right);
                if(curr.left != null) que.offer(curr.left);
            }

        }
        return list;
    }
}
