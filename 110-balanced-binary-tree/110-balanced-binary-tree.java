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
// since the height of a tree is always greater than or equal to 0
// we use -1 as a flag to indicate if the subtree is not balanced
class Solution {
   public boolean ans=true;
    public boolean isBalanced(TreeNode root) {
        helper(root);
        return ans;
    }
    public int helper(TreeNode root)
    {   if(root==null)return 0;
        int left=helper(root.left);
        int right=helper(root.right);
        if(Math.abs(left-right)>1)
            ans= false;
        return Math.max(left,right)+1;
    }
}