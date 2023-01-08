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
    int sum =0 ;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
            return 0;
        sum(root,false);
        
        return sum;
    }
    public void sum(TreeNode root,boolean isLeft)
    {
       if(root==null)
        return ;
        if(root.left==null && root.right ==null  && isLeft )
               sum+= root.val;
        sum(root.left,true);
        sum(root.right,false);
    }
}