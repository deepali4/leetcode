class Solution {
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        
        res.add(root.val);
        if(root.left != null || root.right != null) {
            addLeft(root.left, res);
            addLeaves(root, res);
            addRight(root.right, res);
        }
        return res;
    }
    
    private void addLeft(TreeNode root, List<Integer> res) {
        if(root == null)
            return;
        
        if(!isLeaf(root))
            res.add(root.val);
        if(root.left != null)
            addLeft(root.left, res);
        else
            addLeft(root.right, res);
    }
    
    private void addLeaves(TreeNode root, List<Integer> res) {
        if(root == null)
            return;
        
        if(isLeaf(root))
            res.add(root.val);
        addLeaves(root.left, res);
        addLeaves(root.right, res);
    }
    
    private void addRight(TreeNode root, List<Integer> res) {
        if(root == null)
            return;
        
        if(root.right != null)
            addRight(root.right, res);
        else
            addRight(root.left, res);
        if(!isLeaf(root))
            res.add(root.val);
    }
    
    private boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }
}