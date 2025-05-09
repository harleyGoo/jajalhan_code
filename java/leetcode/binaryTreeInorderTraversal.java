package java.leetcode;

import java.util.*;

// https://leetcode.com/problems/binary-tree-inorder-traversal/description/
// Easy.
// Given the root of a binary tree, return the inorder traversal of its nodes' values.

public class binaryTreeInorderTraversal {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }

    traversal(root, result);
    return result;
  }

  public void traversal(TreeNode root, List<Integer> result) {
    if (root != null) {
      traversal(root.left, result);
      result.add(root.val);
    }
    if (root != null) {
      traversal(root.right, result);
    }
  }
}

// 재귀함수는 실무에서 쓸 일이 거의 없었던 것 같은데...