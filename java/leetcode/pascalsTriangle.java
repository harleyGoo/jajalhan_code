package java.leetcode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle/description/
// Easy.

public class pascalsTriangle {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
    if (numRows == 1) {
      List<Integer> innerList = new ArrayList<>();
      innerList.add(1);
      result.add(innerList);
      return result;
    }
    for (int i = 0; i < numRows; i++) {
      List<Integer> innerList = new ArrayList<>();
      for (int j = 0; j <= i; j++) {
        if (j == 0 || j == i) {
          innerList.add(1);
        } else {
          List<Integer> preList = result.get(i-1);
          innerList.add(preList.get(j-1) + preList.get(j));
        }
      }
      result.add(innerList);
    }

    return result;
  }
}

// 별찍기가 떠오르는 문제.