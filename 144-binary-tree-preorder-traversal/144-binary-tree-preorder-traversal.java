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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        
        if(root==null)
            return res;
        
        stack.push(root);
        
        while(!stack.isEmpty())
        {
            TreeNode topNode= stack.peek();
            res.add(topNode.val);
            stack.pop();
            if(topNode.right!=null)
                stack.push(topNode.right);
            if(topNode.left!=null)
                 stack.push(topNode.left);
            
        }
        
        
        return res;
    }
}