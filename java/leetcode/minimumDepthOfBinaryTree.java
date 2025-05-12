package java.leetcode;

// https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
// Easy.
// Given a binary tree, find its minimum depth.
// The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
// Note: A leaf is a node with no children.

public class minimumDepthOfBinaryTree {
  public int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = minDepth(root.left);
    int right = minDepth(root.right);

    return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
  }
}

// 리턴에서 수치계산을 하는 방법을 염두에 둬야할듯..
// 계속 리턴 전에 result값을 만들어 두려고 하다보니 코드가 길어진다.