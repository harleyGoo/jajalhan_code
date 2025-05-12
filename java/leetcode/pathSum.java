package java.leetcode;

// https://leetcode.com/problems/path-sum/description/
// Easy.
// Given the root of a binary tree and an integer targetSum,
// return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
// A leaf is a node with no children.

public class pathSum {
  public boolean hasPathSum(TreeNode root, int targetSum) {
    return hasPathSum(root, targetSum, 0);
  }

  public boolean hasPathSum(TreeNode root, int targetSum, int sum) {
    if (root == null) {
      return false;
    }
    sum += root.val;
    if (root.left == null && root.right == null) {
      if (sum == targetSum) {
        return true;
      }
    }
    
    boolean result = false;
    if (root.left != null) {
      result = hasPathSum(root.left, targetSum, sum);
    }
    if (result) {
      return result;
    }
    if (root.right != null) {
      result = hasPathSum(root.right, targetSum, sum);
    }
    return result;
  }
}