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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
        return helper(nums,0,nums.length);
    }
    public TreeNode helper(int[] nums , int left , int right){
             if(left==right)
                 return null;
             int max = findMax(nums,left,right);
             TreeNode treeNode = new TreeNode(nums[max]);
             treeNode.left = helper(nums, left , max);
             treeNode.right = helper(nums, max+1 , right);
             return treeNode;
    }
    public int findMax(int[] nums , int left , int right){
       
        int maxId=left;
        
        for(int i = left ;i< right; i++){
             if( nums[i] > nums[maxId]) maxId= i;
        }
           
        return maxId; 
    }
}