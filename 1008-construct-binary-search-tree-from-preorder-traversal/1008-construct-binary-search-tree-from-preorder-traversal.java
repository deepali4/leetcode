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
    int idx =0;
    int[] preorder;
    int n;
    public TreeNode bstFromPreorder(int[] preorder) {
         this.preorder = preorder;
         n = preorder.length;
         return helper(Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public TreeNode helper(int low , int high){
        
        if(idx == n )
            return null;
        
        int val = preorder[idx];
        if(val < low || val > high) return null;
                
        
        idx++;
        TreeNode root = new TreeNode(val);
        root.left = helper(low, val);
        root.right = helper(val, high);
        return root;
        
        
    }
}