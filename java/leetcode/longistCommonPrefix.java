package java.leetcode;

public class longistCommonPrefix {
  
  public String longestCommonPrefix(String[] strs) {
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++) {
      // prefix가 현재 문자열(strs[i])의 접두사가 아닐 때 반복실행
      while (strs[i].indexOf(prefix) != 0) {
        // prefix 길이를 줄여 나감
        prefix = prefix.substring(0, prefix.length() - 1);
        // 공통 접두사가 없는 경우 빈 문자열을 리턴
        if (prefix.isEmpty()) {
          return "";
        }
      }
    }

    return prefix;
}
}