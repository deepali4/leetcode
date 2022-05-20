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
        int h1=0;  // Take h1 and h2 to keep track of heights for 1st and 2nd inputs
        int h2=0;
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null) return false;
  
        TreeNode firstParent = isCousinsHelper(root, x, null,0, true);  // checking for parent for 1st , to be returned as null if value does not exist
        TreeNode secondParent = isCousinsHelper(root, y, null,0, false);   // checking for parent for 2nd , to be returned as null if value does not exist
        if(h1==h2)                   // if at same height , possibly cousins
       {     
        if(firstParent==secondParent ) return false;  // if parents are same , no cousins
        else return true;
        }
        return false;
    }
    TreeNode isCousinsHelper(TreeNode curr, int v, TreeNode parent, int height, boolean isFirst)  // isFirst flag is to check whether we are traversing for 1st or second value
    {
        if(curr==null) return null;   // if no node is there return null 
        if(curr.val==v) {
            if(isFirst== true) h1 = height + 1;   // if we are traversing for 1st value , set h1 as the height , else set h2 as height 
            else h2 = height + 1;
            return parent;  // return parent
        }
        TreeNode left =  isCousinsHelper(curr.left, v , curr, height+1, isFirst);
        TreeNode right = isCousinsHelper(curr.right, v , curr, height+1,isFirst);
  
        if(left!=null) return left;  // check if either left or right of the current node contains the node containing value v
        else if(right!=null) return right;
        
        return null;
    }
}