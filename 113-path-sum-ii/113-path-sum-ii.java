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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
         List<Integer> temp =  new ArrayList<>();
        helper(root,targetSum,temp,res);
        return res;
    }
    public void helper(TreeNode root,int targetSum , List<Integer> temp  ,  List<List<Integer>> res)
    {
       
        if(root==null) return;
        temp.add(root.val);
        if(root.left==null && root.right==null && root.val==targetSum) res.add(new ArrayList<Integer>(temp));
        if(root.left!=null)helper(root.left,targetSum-root.val,temp,res);
        if(root.right!=null)helper(root.right,targetSum-root.val,temp,res);
        temp.remove(temp.size() - 1);

    }
}