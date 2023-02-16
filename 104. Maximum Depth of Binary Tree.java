class Solution 
{
    public int maxDepth(TreeNode root) 
    {
        if(root==null)
            return 0;
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        return 1+Math.max(l,r);
    }
}

//Time Complexity : O(H)
//Space Complexity : O(1)
