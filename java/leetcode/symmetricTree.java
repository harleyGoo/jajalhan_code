package java.leetcode;

// https://leetcode.com/problems/symmetric-tree/description/
// Easy.
// Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

public class symmetricTree {
  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    } else {
      return isSymmetric(root.left, root.right);
    }
  }

  public boolean isSymmetric(TreeNode left, TreeNode right) {
    if (left == null && right == null) {
      return true;
    }
    if (left == null || right == null) {
      return false;
    }
    if (left.val != right.val) {
      return false;
    }

    return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
  }
}

// 재귀함수를 써야한다는 것은 알았지만 어떻게 재귀를 시켜야할지 망설였던 문제.