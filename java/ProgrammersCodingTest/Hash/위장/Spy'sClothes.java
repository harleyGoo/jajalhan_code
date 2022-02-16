package java.programmersCodingTest.Hash.위장;

import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

    int answer = 1;
    HashMap<String, Integer> hm = new HashMap<>();
    for(int i = 0; i < clothes.length; i++){
        String cloth_type = clothes[i][1];
        hm.put(cloth_type, hm.getOrDefault(cloth_type, 1) + 1);
    }
    for (String key : hm.keySet()) {
        answer *= hm.get(key);
    }
    
    System.out.print(answer - 1);
  }
}