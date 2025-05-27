package java.leetcode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-postorder-traversal/description/
// Easy.
// Given the root of a binary tree, return the postorder traversal of its nodes' values.

public class binaryTreePostorderTraversal {
  List<Integer> result = new ArrayList<>();

  public List<Integer> postorderTraversal(TreeNode root) {
    if (root == null) {
      return result;
    }
    postorderTraversal(root.left);
    postorderTraversal(root.right);
    result.add(root.val);
    return result;
  }
}