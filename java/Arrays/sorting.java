package java.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class sorting {
  public static void main(String[] args) {
    Integer[] a = {1, 10, -2, -8};

    // 오름차순 정렬
    Arrays.sort(a);
    System.out.println(Arrays.toString(a));
    // 내림차순 정렬
    Arrays.sort(a, Collections.reverseOrder());
    System.out.println(Arrays.toString(a));
  }
}
