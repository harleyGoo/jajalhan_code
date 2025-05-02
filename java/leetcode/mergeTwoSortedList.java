package java.leetcode;

// https://leetcode.com/problems/merge-two-sorted-lists/description/
// You are given the heads of two sorted linked lists list1 and list2.
// Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
// Return the head of the merged linked list.

public class mergeTwoSortedList {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    // 처음 주어진 ListNode 중 어느 한 쪽이 null인 경우에는 null이 아닌 ListNode를 반환
    if (list1 == null) {
      return list2;
    }
    if (list2 == null) {
      return list1;
    }

    ListNode result = new ListNode();
    ListNode temp = result;

    // 두 개의 ListNode가 둘 다 null이 아닌 경우 반복 실행
    while (list1 != null && list2 != null) {
      if (list1.val > list2.val) {
        // list1의 노드가 list2의 노드보다 큰 경우 temp의 다음 값으로 list2를 설정
        temp.next = list2;
        // 설정이 끝난 list2의 값을 다음 값으로 갱신
        list2 = list2.next;
      } else {
        // list2의 노드가 list1의 노드보다 크거나 작은 경우 temp의 다음 값으로 list1을 설정
        temp.next = list1;
        // 설정이 끝난 list1의 값을 다음 값으로 갱신
        list1 = list1.next;
      }
      temp = temp.next;
    }

    // 두 개의 ListNode 중 어느 한 쪽의 길이가 짧아서 while문이 종료된 경우
    if (list1 == null) {
      temp.next = list2;
    } else {
      temp.next = list1;
    }
    
    return result.next;
  }
}

// 참고: https://devraphy.tistory.com/555