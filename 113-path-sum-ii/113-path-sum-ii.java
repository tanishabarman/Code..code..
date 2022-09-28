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
    
    public void helper(TreeNode root,int sum,int tar,List<List<Integer>> ans,List<Integer> ds){
        
        if(root==null) return;
        if(root.left==null && root.right==null){
            if(sum+root.val==tar){
                ds.add(root.val);
                ans.add(new ArrayList<>(ds));
                ds.remove(ds.size()-1);
            }
            return;
        }
        ds.add(root.val);
        
        helper(root.left,sum+root.val,tar,ans,ds);
        
        helper(root.right,sum+root.val,tar,ans,ds);
        
        ds.remove(ds.size()-1);
        
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(root,0,targetSum,ans,new ArrayList<>());
        return ans;
    }
}