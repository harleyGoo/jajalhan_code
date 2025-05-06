package java.leetcode;

// https://leetcode.com/problems/search-insert-position/description/
// Easy.
// Given a sorted array of distinct integers and a target value, return the index if the target is found.
// If not, return the index where it would be if it were inserted in order.
// You must write an algorithm with O(log n) runtime complexity.

public class searchInsertPosition {
  public int searchInsert(int[] nums, int target) {
    int k = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < target) {
        k++;
      } else {
        return i;
      }
    }
    return k;
  }
}

// 복잡도 O(log n) 조건이 있어서 걱정했는데 의외로 지금까지 푼 Easy문제 중에 가장 쉬웠던 느낌..