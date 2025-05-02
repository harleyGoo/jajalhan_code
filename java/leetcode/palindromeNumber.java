package java.leetcode;

// https://leetcode.com/problems/palindrome-number/description/
// Easy.
// Given an integer x, return true if x is a palindrome, and false otherwise.

public class palindromeNumber {
  public boolean isPalindrome(int x) {
    StringBuilder sb = new StringBuilder();
    String []strX = String.valueOf(x).split("");

    for (int i = 0; i < strX.length; i++) {
      sb = sb.append(strX[i]);
    }
    String orgX = sb.toString();

    String revX = new StringBuilder(orgX).reverse().toString();

    return orgX.equals(revX);
  }
}