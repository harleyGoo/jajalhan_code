package java.leetcode;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
// Easy.

public class removeDuplicatesFromSortedArray {
  public int removeDuplicates(int[] nums) {
    int k = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1]) {
        nums[k] = nums[i];
        k++;
      }
    }

    return k;
  }
}