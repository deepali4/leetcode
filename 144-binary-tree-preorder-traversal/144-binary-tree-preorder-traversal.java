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
        
       List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
       Stack<TreeNode> st = new Stack<>();
    
        st.push(root);
        
       while(!st.isEmpty()){
           TreeNode cur = st.pop();
           ans.add(cur.val);
           if(cur.right != null)
           st.push(cur.right);
           if(cur.left != null)
           st.push(cur.left);
           
       }
        
       return ans;
        
    }
}