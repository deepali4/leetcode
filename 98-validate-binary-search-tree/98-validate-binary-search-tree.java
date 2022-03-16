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
    public boolean isValidBST(TreeNode root) {
     return solve(root,Long.MIN_VALUE,Long.MAX_VALUE);   
    }
     boolean solve(TreeNode root,long left ,long right)
    {
        if(root==null)
            return true;
        if(root.val<=left||root.val>=right)
            return false;
        return solve(root.left,left,root.val)&& solve(root.right,root.val,right);
    }
    
}