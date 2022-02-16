package java.codilityCodingTest.조건에맞는양수출력;

import java.util.*;

class sampleTest {
  public int solution(int[] A) {
    int result = -1;

    Arrays.sort(A);
    if (A[0] < 0) {
      return 1;
    }

    int[] tmp = new int[A.length - 1];
    for (int i=0; i < A.length-1; i++) {
      if (A[i+1] - A[i] > 1) {
        tmp[i] = A[i] + 1;
      }
    }

    boolean flg = false;
    for (int i=0; i < tmp.length; i++) {
      if (tmp[i] > 0) {
        flg = true;
      }
      if (flg) {
        if (result < tmp[i]) {
          result = tmp[i];
        }
        return result;
      }
    }
    if (!flg) {
      result = A[A.length-1] + 1;
    }

    return result;
  }
}

// 총점: 33%

// This is a demo task.

// Write a function:

// class Solution { public int solution(int[] A); }

// that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

// For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

// Given A = [1, 2, 3], the function should return 4.

// Given A = [−1, −3], the function should return 1.

// Write an efficient algorithm for the following assumptions:

// N is an integer within the range [1..100,000];
// each element of array A is an integer within the range [−1,000,000..1,000,000].
// Copyright 2009–2022 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
