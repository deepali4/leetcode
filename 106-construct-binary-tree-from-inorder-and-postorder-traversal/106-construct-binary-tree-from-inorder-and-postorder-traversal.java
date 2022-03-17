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
    int postIdx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
                postIdx = n-1;

    return helper(0, n - 1, postorder, inorder);
    }
    

    public TreeNode helper(int start , int end , int[] postorder , int[] inorder )
    {
        
        if(start>end)
            return null;
        TreeNode root = new TreeNode (postorder[postIdx--]);
        
        
         int curr = findIndex(inorder, root.val);

        root.right = helper(curr+1,end,postorder,inorder);
        root.left = helper(start,curr-1,postorder,inorder);

        
        return root;
        
        
    }
    
    int findIndex(int[] inorder, int key){
        for(int i = inorder.length-1; i>=0; i--){
            if(inorder[i] == key) return i;
        }
        return -1;
    }

}