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
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        
        List<Integer> res = new ArrayList();
        if (root == null) {
            return res;
        }
        if (!isLeaf(root)) {
            res.add(root.val);
        }
        addLeftBoundary(root,res);
        addLeafs(root,res);
        addRightBoundary(root,res);
        
        return res;
    }
    
    public boolean isLeaf(TreeNode node)
    {
        if(node.left==null && node.right==null)
            return true;
        else
            return false;
    }
    public void addLeftBoundary(TreeNode root , List<Integer>res)
    {   
        TreeNode cur= root.left;
        while(cur!=null){
            
         if(isLeaf(cur)==false) res.add(cur.val);
            
         if(cur.left!=null)cur=cur.left;
         else cur=cur.right;
        }
        
    }
    
    public void addLeafs(TreeNode root , List<Integer>res)
    {
        if(isLeaf(root)==true)
        { 
            res.add(root.val); return;
        }
        
        if(root.left!=null)addLeafs(root.left,res);
        if(root.right!=null)addLeafs(root.right,res);
    }
    
    public void addRightBoundary(TreeNode root , List<Integer>res)
    {   
        ArrayList < Integer > tmp = new ArrayList < Integer > ();

        TreeNode cur= root.right;
        while(cur!=null){
         if(isLeaf(cur)==false) tmp.add(cur.val);
         if(cur.right!=null)cur=cur.right;
            else cur=cur.left;
        }
        
        for(int i = tmp.size()-1;i>=0;--i)
        {
            res.add(tmp.get(i));
        }
    }
}
