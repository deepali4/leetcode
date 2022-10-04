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
    public List<List<Integer>> findLeaves(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        while(root.left!=null || root.right != null){
            List<Integer> temp =new ArrayList<>();
            preorder(root,temp);
            res.add(temp);
        }
        
        res.add(new ArrayList<>(List.of(root.val)));
        return res;
    }
    
    public boolean preorder(TreeNode root ,  List<Integer> temp){
//         if(root==null || root.left== null || root.right==null) return;
        
        
//         if(root.left.left == null && root.left.left== null) {
//             temp.add(root.left.val);
//             root.left=null;
//         }
        
//         if(root.right.left == null && root.right.left== null) {
//             temp.add(root.right.val);
//             root.right=null;
        
        
//         }
        
        if(root == null ) return false;
        
        if(root.left==null && root.right==null){
            temp.add(root.val); return true;
        }
        
        if(preorder(root.left,temp) ){
           root.left=null;
        }
        if(preorder(root.right,temp)){
            root.right=null;
        }
        
        
        return false;
    }
}