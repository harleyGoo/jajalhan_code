package java.leetcode;

// https://leetcode.com/problems/add-two-numbers/description/
// Medium.
// You are given two non-empty linked lists representing two non-negative integers.
// The digits are stored in reverse order, and each of their nodes contains a single digit.
// Add the two numbers and return the sum as a linked list.
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

public class addTwoNumbers {
  public ListNode addTwoNumbersLeetcode(ListNode l1, ListNode l2) {
    // Convert ListNode to Long
    Long longL1 = convertListNodeToLong(l1);
    Long longL2 = convertListNodeToLong(l2);

    // Add two numbers
    Long sum = longL1 + longL2;

    // Convert Long to ListNode
    ListNode result = convertLongToListNode(sum);

    return result;
  }

  /*
  * Convert ListNode to Long
  */
  public Long convertListNodeToLong(ListNode ln) {
    ListNode tmpLn = ln;
    StringBuilder sb = new StringBuilder();

    while (true) {
      sb.append(tmpLn.val);
      // End while when next Node is not exist
      if (tmpLn.next == null) {
        break;
      }
      tmpLn = tmpLn.next;
    }
    // Make the StringBuilder reverse and convert to String
    String strLn = sb.reverse().toString();
    Long result = Long.parseLong(strLn);

    return result;
  }

  /*
  * Convert Long to ListNode
  */
  public ListNode convertLongToListNode(Long sum) {
    String []strSum = String.valueOf(sum).split("");
    ListNode result = null;
    for (int i = 0; i < strSum.length; i++) {
        ListNode node;
        int value = Integer.parseInt(strSum[i]);
        node = new ListNode(value, result);
        result = node;
    }

    return result;
  }
}

// 위 소스로는 아래 Test Case가 java.lang.NumberFormatException: For input string: "1000000000000000000000000000001" 에러.
// l1 = [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]
// l2 = [5,6,4]

// 다른 사람 풀이
// public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//     ListNode ans = new ListNode(0);
//     ListNode p = l1, q = l2, cur = ans;
//     int carry = 0;

//     while(p != null || q != null) {
//         int x = (p != null) ? p.val : 0;
//         int y = (q != null) ? q.val : 0;
//         int sum = carry + x + y;
//         carry = sum/10;
//         cur.next = new ListNode(sum%10);
//         cur = cur.next;
//         if (p != null ) p = p.next;
//         if (q != null ) q = q.next;
//     }

//     if (carry > 0) {
//         cur.next = new ListNode(carry);
//     }

//     return ans.next;
// }