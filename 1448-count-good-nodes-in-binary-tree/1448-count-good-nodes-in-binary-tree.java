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
        return helper(root,root.val);
        
    }
    public int helper(TreeNode root,int max)
    {
        if(root.left==null && root.right==null)
        {
            int x=root.val>=max?1:0;
            return x;
        }
        int x=root.val>=max?1:0;
        int y=0;
        if(root.left!=null)
        {
            x+=helper(root.left,Math.max(max,root.val));
            
        }
        if(root.right!=null)
        {
            y+=helper(root.right,Math.max(max,root.val));
        }
        return x+y;
    }
}