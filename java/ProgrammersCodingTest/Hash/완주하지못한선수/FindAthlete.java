package java.ProgrammersCodingTest.Hash.완주하지못한선수;

import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
    String[] completion = {"josipa", "filipa", "marina", "nikola"};

    String answer = "";
    int val = 0;
    HashMap<String, Integer> hm = new HashMap<>();

    for (String part : participant) {
        if (hm.get(part) == null) {
            hm.put(part, 1);
        } else {
            val = hm.get(part) + 1;
            hm.put(part, val);
        }
    }

    for (String comp : completion) {
        val = hm.get(comp) - 1;
        hm.put(comp, val);
    }

    for (String key : hm.keySet()) {
        if (hm.get(key) == 1) {
            answer = key;
        }
    }

    System.out.println(answer);
  }
}
