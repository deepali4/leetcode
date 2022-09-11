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
     List<Integer> ans = new ArrayList<>();
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {

        if(root == null) return null;
        ans.add(root.val);
        if(root.left != null || root.right != null) {
            addleft(root.left);
            addLeaves(root);
            addRight(root.right);
        }
        
        return ans;
    }
    
    public boolean isLeaf(TreeNode root){
        
        return (root.left == null) && (root.right == null);
    }
    
    public void addleft(TreeNode root){
         while(root != null){
           if(!isLeaf(root)) ans.add(root.val);
            if(root.left!=null)
                root = root.left;
            else 
                root= root.right;
        }
        
    }
    public void addLeaves(TreeNode root){
           if(isLeaf(root)) {
               ans.add(root.val);
                return ;
           }
           if(root.left!=null)addLeaves(root.left);
           if(root.right!=null) addLeaves(root.right);
    }
    
    public void addRight(TreeNode root){
        List<Integer> temp = new ArrayList<>();
        while(root != null){
           if(!isLeaf(root)) temp.add(root.val);
           if(root.right!=null)
                root = root.right;
            else 
                root= root.left;
        }
         
        for(int i = temp.size()-1 ;i >=0 ;i--){
            ans.add(temp.get(i));
        }
         
         
    }
    
     
}