package java.leetcode;

import java.util.LinkedList;
import java.util.List;

public class paslcalsTriangle2 {
  public List<Integer> getRow(int rowIndex) {
    List<Integer> result = new LinkedList<Integer>();
    
    for (int row = 0; row <= rowIndex; row++) {
      result.add(0, 1);
      for (int i = 1; i < row; i++)
        result.set(i, result.get(i) + result.get(i + 1));
    }
    
    return result;
  }
}

// 참고: https://blog.naver.com/joonbread/222908076469
// 시간 1ms

// 풀면서도 이건 좀 비효율적이네 했던 내 코드(시간 14ms)
// public List<Integer> getRow(int rowIndex) {
//   List<List<Integer>> fullList = new ArrayList<>();
  
//   for (int i = 0; i < 99; i++) {
//     List<Integer> innerList = new ArrayList<>();
//     for (int j = 0; j <= i; j++) {
//       if (j == 0 || j == i) {
//         innerList.add(1);
//       } else {
//         List<Integer> preList = fullList.get(i-1);
//         innerList.add(preList.get(j-1) + preList.get(j));
//       }
//     }
//     fullList.add(innerList);
//   }

//   return fullList.get(rowIndex);
// }