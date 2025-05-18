package java.leetcode;

// https://leetcode.com/problems/single-number/description/
// Easy.
// Given a non-empty array of integers nums, every element appears twice except for one.
// Find that single one.
// You must implement a solution with a linear runtime complexity and use only constant extra space.

public class singleNumber {
  public int getSingleNumber(int[] nums) {
    int result = 0;
    for (int num : nums) {
      result ^= num;
    }
    return result;
  }

  // ^= 연산자: 배타적 논리합(XOR)
  // 그냥 숫자 계산이 아니라, 이진수로 각 비트끼리 XOR한 결과
}

// 내가 작성한 코드(Beats 19.34%)
// public int singleNumber(int[] nums) {
//   Map<Integer, Integer> map = new HashMap<>();
//   for (int i = 0; i < nums.length; i++) {
//     if (map.containsKey(nums[i])) {
//       map.put(nums[i], map.get(nums[i]) + 1);
//     } else {
//       map.put(nums[i], 1);
//     }
//   }
//   for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//     if (entry.getValue() == 1) {
//       return entry.getKey();
//     }
//   }
//   return 0;
// }