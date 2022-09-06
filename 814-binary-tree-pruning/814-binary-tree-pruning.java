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
    public boolean helper(TreeNode root){
        if(root.val==0 && root.left==null && root.right==null) return true;
        if(root.left==null && root.right==null) return false;
        boolean x=true;
        boolean y=true;
        if(root.left!=null)
            x = helper(root.left);
        if(root.right!=null)
            y = helper(root.right);
        if(x) root.left=null;
        if(y) root.right=null;
        return ((root.val==0)&&(x&&y));   
    }
    public TreeNode pruneTree(TreeNode root) {
        boolean x = helper(root);
        if(x) return root=null;
        return root;        
    }
}