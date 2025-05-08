package java.leetcode;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
// Easy.
// Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
// Return the linked list sorted as well.

public class removeDuplicatesFromSortedList {
  public ListNode deleteDuplicates(ListNode head) {
    if (head == null) {
      return head;
    }

    ListNode temp = head;
    while (temp != null) {
      if (temp.next == null) {
        break;
      }
      if (temp.val == temp.next.val) {
        temp.next = temp.next.next;
      } else {
        temp = temp.next;
      }
    }

    return head;
  }
}