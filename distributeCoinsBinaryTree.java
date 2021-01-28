// Time Complexity : o(n)
// Space Complexity : Height of a tree
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
//LC : 979
//Approach: DFS

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
    int moves =0 ;
    public int distributeCoins(TreeNode root) {
        if(root == null){
            return 0;
        }
        dfs(root);
        return  moves;
    }
    private int dfs(TreeNode root){
        if(root == null) return 0;
        
        int spareCoins = root.val - 1;
        spareCoins += dfs(root.right);
        spareCoins += dfs(root.left);
        moves += Math.abs(spareCoins);
        
        return spareCoins;
    }
}