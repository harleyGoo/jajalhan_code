package java.leetcode;

// https://leetcode.com/problems/length-of-last-word/description/
// Easy.
// Given a string s consisting of words and spaces, return the length of the last word in the string.
// A word is a maximal substring consisting of non-space characters only.

public class lengthOfLastWord {
  public int getLastWordLength(String s) {
    s = s.trim();
    String[] sl = s.split(" ");
    String lastWord = sl[sl.length-1];
    return lastWord.length();
  }
}

// 이것도 쉬웠네.