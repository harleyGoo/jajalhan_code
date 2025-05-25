package java.leetcode;

// import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-preorder-traversal/description/
// Easy.
// Given the root of a binary tree, return the preorder traversal of its nodes' values.

public class binaryTreePreorderTraversal {
  public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new LinkedList<Integer>();
		if (root == null) {
      return result;
    }
		result.add(root.val);
		result.addAll(preorderTraversal(root.left));
		result.addAll(preorderTraversal(root.right));
    return result;

    // 내가 처음 작성했던 솔루션
    // public List<Integer> preorderTraversal(TreeNode root) {
    // List<Integer> result = new ArrayList<>();
    // if (root == null) {
    //   return result;
    // }
    // return traverse(root, result);
    // }
  }

  public List<Integer> traverse(TreeNode root, List<Integer> result) {
    result.add(root.val);

    if (root.left != null) {  
      result = traverse(root.left, result);
    }
    if (root.right != null) {
      result = traverse(root.right, result);
    }

    return result;
  }
}

// 한번에 100% 찍었다.
// (2025.05.25) 더 간단한 코드로 업뎃.