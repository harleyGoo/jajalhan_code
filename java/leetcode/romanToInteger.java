package java.leetcode;

// https://leetcode.com/problems/roman-to-integer/description/
// Easy.

import java.util.*;

public class romanToInteger {
  public int romanToInt(String s) {
      Map<Character, Integer> romanMap = new HashMap<>();
      romanMap.put('I', 1);
      romanMap.put('V', 5);
      romanMap.put('X', 10);
      romanMap.put('L', 50);
      romanMap.put('C', 100);
      romanMap.put('D', 500);
      romanMap.put('M', 1000);

      int length = s.length();
      // 문자열의 마지막은 항상 더해야 하므로 마지막부터 변환치를 취득
      int result = romanMap.get(s.charAt(length - 1));
      // 문자열의 끝에서 두번째부터 역순으로 for문 실행
      for (int i = length - 2; i >= 0; i--) {
          if (romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
              // 현재(i)값이 다음(i+1)값보다 작으면 빼기
              result = result - romanMap.get(s.charAt(i));
          } else {
              // 현재(i)값이 다음(i+1)값보다 크면 더하기
              result = result + romanMap.get(s.charAt(i));
          }
      }

      return result;
  }
}