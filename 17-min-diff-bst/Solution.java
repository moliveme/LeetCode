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
    public int getMinimumDifference(TreeNode root) {

        // base
        // if left and right null, return 0
        // if left null, return |root - right|
        // if right null, return |left - root|

        // recursive
        // compare |root - right| and |left - root|
        // if 1 > 2, 
        return 0;
    }
}