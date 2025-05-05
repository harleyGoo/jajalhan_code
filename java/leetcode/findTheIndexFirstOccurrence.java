package java.leetcode;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
// Easy.
// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
// or -1 if needle is not part of haystack.

public class findTheIndexFirstOccurrence {
  public int strStr(String haystack, String needle) {
    int i = 0; int j = needle.length();
    while (j <= haystack.length()) {
      if (haystack.substring(i, j).equals(needle)) {
        return i;
      }
      i++;
      j++;
    }
    return -1;
  }
}

// 내가 풀었던 코드: 딱봐도 indexOf의 결과값을 구하는 것 같길래 사용했더니 통과됐다.
// 하지만 출제의도라는 게 있다는 사람들의 의견에 따라 다른 솔루션으로 공부.
  // public int strStr(String haystack, String needle) {
  //   return haystack.indexOf(needle);
  // }