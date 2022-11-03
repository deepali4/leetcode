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
    public boolean evaluateTree(TreeNode root) {
        
        return bfs(root) == 1 ? true : false;
        
    }
    public int bfs(TreeNode root){
        
        if(root.left == null && root.right==null) return root.val;
        
         int leftVal = bfs(root.left);
         int rightVal =  bfs(root.right);
         boolean leftBVal = leftVal == 1 ? true : false ;  
         boolean rigthBVal = rightVal == 1 ? true : false ;  
         boolean ans = root.val == 2 ? (leftBVal || rigthBVal) : (leftBVal && rigthBVal);
        
        if(ans == true) root.val = 1 ;
            else root.val = 0;
        
        return root.val;
    }
}