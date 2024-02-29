package java.programmersCodingTest.Hash.폰켓몬;

import java.util.*;

public class ponketmon {
  public int solution(int[] nums) {
    int answer = 0;
    int chance = nums.length / 2;

    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      if (!map.containsKey(num)) {
        map.put(num, 1);
        answer += 1;
      }
    }

    if (answer > chance) {
      answer = chance;
    }

    return answer;
  }
}

// 다른 사람의 풀이
// import java.util.HashSet;

// class Solution {
//   public int solution(int[] nums) {

//     HashSet<Integer> hs = new HashSet<>();

//     for (int i = 0; i < nums.length; i++) {
//       hs.add(nums[i]);
//     }

//     if (hs.size() > nums.length / 2)
//         return nums.length/2;

//     return hs.size();
//   }
// }
// hashset: value를 자바에서 자동으로 임의 지정하며 key에 중복을 배제하고 값을 넣음.
// hashmap: key와 value를 개발자가 직접 기입하고 키의 중복을 배제함.
//          이때 hash는 키를 이용해서 값을 찾기 때문에 검색 알고리즘에 매우 효율적.
// arraylist: 사용자가 정의한 <제너릭>객체에 맞는 값을 넣어 저장하고 중복 삽입이 가능.
//            단, 수정 변경시 배열을 새로 생성해서 배열채로 집어넣기에 수정이 상대적으로 느림.
//            또한 키로 값을 찾을 수 없기에 검색 알고리즘에 매우 느린 속도를 자랑함.
//            단, foreach문에선 arraylist가 더 빠르다