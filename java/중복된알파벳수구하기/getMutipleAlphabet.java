package java.중복된알파벳수구하기;

import java.util.Map;
import java.util.HashMap;

class getMutipleAlphabet {
  public static void main(String[] args) {
        String str = "abdbb";
    
    String[] list = str.split("");
    Map<String, Integer> map = new HashMap<String, Integer>();
    int result = 0;
    int val = 0;

    for (String s : list) {
      if (map.get(s) == null) {
        map.put(s, 1);
      } else {
        val = map.get(s) + 1;
        map.put(s, val);
      }
    }
    for (String key : map.keySet()) {
      if (map.get(key) > 1) {
        result += 1;
      }
    }

    System.out.println(result);
  }
}