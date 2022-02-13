package easy;

import javax.swing.tree.TreeNode;

public class RangeSumofBST938 {

}
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
class RangeSumofBST938Solution {
    int s =0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root==null) return 0;
        sum(root, low, high);
        return s;
    }
    public void sum(TreeNode root, int L, int H){
        if(root.val>=L && root.val<=H){
            s+=root.val;
        }
        if(root.left.val!=null && root.left.val>=L){
            sum(root.left, L, H);
        }
        if(root.right.val!=null && root.right.val<=H){
            sum(root.right, L, H);
        }
        
    }
    
} 