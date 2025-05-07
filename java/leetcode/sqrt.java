package java.leetcode;

// https://leetcode.com/problems/sqrtx/description/
// Easy.
// Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
// The returned integer should be non-negative as well.
// You must not use any built-in exponent function or operator.

public class sqrt {
  public int mySqrt(int x) {
    if (x < 2) {
      return x;
    }
    long num;
    int pivot;
    int left = 2;
    int right = x / 2;
    while (left <= right) {
      pivot = left + (right - left) / 2;
      num = (long)pivot * pivot;
      if (num > x) {
        right = pivot - 1;
      } else if (num < x) {
        left = pivot + 1;
      } else {
        return pivot;
      }
    }
    return right;
  }
}

// 난이도가 Easy라는데 전혀 그렇게 안느껴진다...
// 애초에 pivot을 활용한다는 생각 자체가 안떠올라서 일찌감치 포기한 문제