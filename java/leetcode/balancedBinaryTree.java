package java.leetcode;

// https://leetcode.com/problems/balanced-binary-tree/description/
// Easy.
// Given a binary tree, determine if it is height-balanced.

public class balancedBinaryTree {
  public boolean result = true;
  
  public boolean isBalanced(TreeNode root) {
    checkDepth(root);
    return result;
  }

  public int checkDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = checkDepth(root.left);
    int right = checkDepth(root.right);
    if (Math.abs(left - right) > 1) {
      // 트리 함수의 높이차이가 1보다 커질 때, result를 갱신.
      result = false;
    }
    return Math.max(left, right) + 1;
  }
}

// 균형 이진트리: 왼쪽과 오른쪽 트리의 높이 차이가 모두 1인 트리.
// 반환할 boolean 변수를 전역변수로 선언.
// checkDepth안에서 전역변수 result를 갱신.