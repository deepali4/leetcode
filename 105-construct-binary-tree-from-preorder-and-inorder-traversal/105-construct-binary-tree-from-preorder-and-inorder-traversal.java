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
    int preIdx=0;
   public TreeNode buildTree(int[] preorder, int[] inorder) {
       int n = inorder.length;
    return helper(0, n - 1, preorder, inorder);
   }

    public TreeNode helper(int start , int end , int[] preorder , int[] inorder )
    {
        
        if(start>end)
            return null;
        TreeNode root = new TreeNode (preorder[preIdx++]);
        
        
         int curr = findIndex(inorder, root.val);

        root.left = helper(start,curr-1,preorder,inorder);
        root.right = helper(curr+1,end,preorder,inorder);
        
        
        return root;
        
        
    }
     int findIndex(int[] inorder, int key){
        for(int i =0; i<inorder.length; i++){
            if(inorder[i] == key) return i;
        }
        return -1;
    }

}
    
