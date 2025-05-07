package java.leetcode;

// https://leetcode.com/problems/climbing-stairs/description/
// Easy.
// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

public class climbingStairs {
  public int climbStairs(int n) {
    if (n <= 2) {
      return n;
    }
    
    int[] arr = new int[n+1];
    // 1칸씩 오르는 경우
    arr[1] = 1;
    // 2칸씩 오르는 경우
    arr[2] = 2;

    // n이 3이상인 경우.
    for (int i = 3; i <= n; i++) {
      arr[i] = arr[i-1] + arr[i-2];
    }

    return arr[n];
  }
}

// 참고: https://jeonji.tistory.com/41
// sqrt와 마찬가지로 전략을 짜는 단계에서부터 실패한 문제.
// 단순 재귀를 사용할 경우 타임아웃이 발생하므로 DP(동적 프로그래밍)을 사용해야 함.
// 이게 Easy라니.