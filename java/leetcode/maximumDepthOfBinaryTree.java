package java.leetcode;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
// Easy.
// Given the root of a binary tree, return its maximum depth.
// A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

public class maximumDepthOfBinaryTree {
  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }

    int depth = 1;
    depth = maxDepth(root, depth);
    return depth;
  }

  public int maxDepth(TreeNode root, int depth) {
    if (root.left == null && root.right == null) {
      return depth;
    }
    int left = depth;
    int right = depth;
    if (root.left != null) {
      left = maxDepth(root.left, depth+1);
    }
    if (root.right != null) {
      right = maxDepth(root.right, depth+1);
    }
    return left > right ? left : right;
  }
}

// 깊이우선탐색(DFS)