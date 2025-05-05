package java.leetcode;

// https://leetcode.com/problems/remove-element/description/
// Easy.

public class removeElement {
  public int removeValInArray(int[] nums, int val) {
    if (nums.length == 0) {
      return 0;
    }

    int k = 0;
    for (int i = 1; i < nums.length + 1; i++) {
      if (nums[i-1] != val) {
        nums[k] = nums[i-1];
        k++;
      }
    }
    return k;
  }
}