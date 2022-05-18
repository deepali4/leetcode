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
    public int[] findMode(TreeNode root) {
        Map< Integer , Integer > map  = new HashMap<>();
        countFrequency(root, map);
        int maxFeq= 0;
         for ( Map.Entry< Integer , Integer > entry : map.entrySet()) {
            if(entry.getValue()>maxFeq)
            maxFeq=entry.getValue();
        }
        List<Integer> ans=  new ArrayList<>();
        for ( Map.Entry< Integer , Integer > entry : map.entrySet()) {
            if(entry.getValue()==maxFeq)
            ans.add(entry.getKey());
        }
        int[] res = new int[ans.size()];
        int i =0;
        for(int x :  ans)
            res[i++]=x;
        
        return res;
        
    }
    public void countFrequency(TreeNode root, Map< Integer , Integer > map )
    {
        if(root!=null){
            map.put(root.val, map.getOrDefault(root.val,0)+1);
            countFrequency(root.left,map);
            countFrequency(root.right,map);
        }
           
    }
}