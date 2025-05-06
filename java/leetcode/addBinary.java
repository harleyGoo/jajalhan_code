package java.leetcode;

// https://leetcode.com/problems/add-binary/description/
// Easy.
// Given two binary strings a and b, return their sum as a binary string.

public class addBinary {
  public String addBinaryString(String a, String b) {
    // 리턴용 sb
    StringBuilder sb = new StringBuilder();
    // 역순계산을 위해 reverse
    StringBuilder sbA = new StringBuilder(a);
    StringBuilder sbB = new StringBuilder(b);
    sbA.reverse();
    sbB.reverse();

    int carry = 0;
    int i = 0;
    int sum;
    while (i < sbA.length() || i < sbB.length()) {
      sum = carry;
      if (i < sbA.length()) {
        sum += sbA.charAt(i) - '0';
      }
      if (i < sbB.length()) {
        sum += sbB.charAt(i) - '0';
      }
      // 이진법에서 나올 수 있는 경우의 수 4가지
      switch (sum) {
        case 0:
          // 0 + 0
          sb.append('0');
          break;
        case 1:
          // 0 + 1
          sb.append('1');
          if (carry == 1) {
            carry = 0;
          }
          break;
        case 2:
          // 1 + 1
          sb.append('0');
          carry = 1;
          break;
        case 3:
          // 1 + 1 + 1(carry)
          sb.append('1');
          carry = 1;
          break;
      }
      i++;
    }
    
    if (carry == 1) {
      sb.append('1');
    }

    // 역순계산으로 만들어진 String을 다시 reverse해서 리턴.
    return sb.reverse().toString();
  }
}