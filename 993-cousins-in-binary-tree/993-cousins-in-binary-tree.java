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
    TreeNode parent1 = null;
    TreeNode parent2 = null;
    public boolean isCousins(TreeNode root, int x, int y) {
        
        if(root.val== x || root.val == y ) return false;
        int level1 = findlevel(root,parent1,x,0,true);
        int level2 = findlevel(root,parent2,y,0,false);
        
        if(parent1!=parent2 && level1== level2)
          return true;
        System.out.println(parent1.val);
         System.out.println(parent2.val);
        return false;
        
    }
    public int findlevel(TreeNode root,TreeNode parent, int value, int level,boolean isFirst){
        if(root== null) return 0;
        if(root.val==value)
            return level;
        if(isFirst)
         parent1= root;
        else
        parent2=root;
        
        int left =findlevel(root.left,parent, value, level+1,isFirst);
        if(left!= 0) return  left;
        
       if(isFirst)
         parent1= root;
        else
        parent2=root;
        int right = findlevel(root.right,parent,value,level+1,isFirst);
            if(right!=0) return right;
    
        return 0;
    }
}