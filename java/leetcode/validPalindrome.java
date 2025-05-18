package java.leetcode;

// https://leetcode.com/problems/valid-palindrome/description/
// Easy.
// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters 
// and removing all non-alphanumeric characters, it reads the same forward and backward.
// Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.

public class validPalindrome {
  public boolean isPalindrome(String s) {
    int left = 0, right = s.length() - 1;
    
    while (left < right) {
      while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
        left++;
      }
      while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
        right--;
      }
      if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
        return false;
      }
      left++;
      right--;
    }
    
    return true;
  }
}

// 내가 작성한 코드(다른 사람들 솔루션을 보니 StringBuilder 없이 풀이...)
// public boolean isPalindrome(String s) {
//   s = s.trim();
//   s = s.toLowerCase();
//   s = s.replaceAll("[^a-z0-9]", "");
//   StringBuilder sb = new StringBuilder(s);
//   String rev = sb.reverse().toString();
//   if (s.equals(rev)) {
//     return true;
//   }
//   return false;
// }