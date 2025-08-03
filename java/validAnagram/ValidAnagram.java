package java.validAnagram;

// 두 문자열이 애너그램인지 확인하세요.

public class ValidAnagram {
  public boolean validAnagram(String s, String t) {
    if (s.length() != t.length()) {
        return false;
    }

    int[] count = new int[26]; // 영문자 a~z만 가정
    for (int i = 0; i < s.length(); i++) {
      // Java에서 문자는 내부적으로 정수(유니코드, ASCII) 값으로 취급
      // -'a'하는 것으로 0~25 사이의 인덱스로 변환처리
      count[s.charAt(i) - 'a']++;
      count[t.charAt(i) - 'a']--;
    }

    for (int c : count) {
      if (c != 0) return false;
    }

    return true;
  }
}

// 느리지만 아래 방식도 OK
// public boolean validAnagram(String s, String t) {
//     if (s.length() != t.length()) return false;

//     char[] sArr = s.toCharArray();
//     char[] tArr = t.toCharArray();
//     Arrays.sort(sArr);
//     Arrays.sort(tArr);

//     return Arrays.equals(sArr, tArr);
// }