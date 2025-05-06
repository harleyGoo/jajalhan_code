package java.leetcode;

// https://leetcode.com/problems/plus-one/description/
// Easy.
// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
// Increment the large integer by one and return the resulting array of digits.

public class plusOne {
  public int[] plusOneToLast(int[] digits) {
    int n = digits.length;
    for (int i = n-1; i >= 0; i--) {
      // 마지막 요소가 9가 아닌 경우, 마지막 요소를 +1한 후 리턴.
      if (digits[i] < 9) {
        digits[i]++;
        return digits;
      }
      // 마지막 요소가 9인 경우, 마지막 요소를 0으로 설정하고 하나 앞의 요소 체크.
      digits[i] = 0;
    }
    // 길이를 1 늘린 배열로 초기화.
    int[] result = new int [n+1];
    // 첫번째 요소를 1로 설정.
    result[0] = 1;
    return result;
  }
}

// 내가 작성했던 코드.
// digits = [9,9]의 경우 결과가 [9, 1, 0]이 되며 오답이 된다.
// 숫자의 올림이 들어가는 문제의 경우, 마지막 요소부터 확인하는 반복문을 쓰는 것이 좋은 듯.

// public int[] plusOne(int[] digits) {
//   int[] result = new int[digits.length];
//   for (int i = 0; i < digits.length; i++) {
//     if (i != digits.length-1) {
//       result[i] = digits[i];
//     } else {
//       result[i] = digits[i] + 1;
//     }
//   }

//   if (result[result.length-1] > 9) {
//     int[] tmp = result;
//     result = new int[result.length + 1];
//     for (int i = 0; i < tmp.length; i++) {
//       if (tmp[i] > 9) {
//         result[i] = 1;
//         result[i+1] = 0;
//         i++;
//       } else {
//         result[i] = tmp[i];
//       }
//     }
//   }
//   return result;
// }