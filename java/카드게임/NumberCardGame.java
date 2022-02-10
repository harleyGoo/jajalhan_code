package java.카드게임;

import java.util.Scanner;
import java.util.HashMap;

public class NumberCardGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] input = sc.nextLine().split(" ");
    int row = Integer.parseInt(input[0]);
    int column = Integer.parseInt(input[1]);

    int cnt = 0;
    HashMap<Integer, int[]> hm = new HashMap<>();

    while(cnt != row) {
      String[] str = sc.nextLine().split(" ");
      if (str.length == column) {
        cnt += 1;
      }
      int[] nums = new int[column];
      for (int i = 0; i < str.length; i++) {
        int intNum = Integer.parseInt(str[i]);
        nums[i] = intNum;
      }
      hm.put(cnt, nums);
    }

    int[] smallest = new int[row];
    for (int i = 1; i < hm.size() + 1; i++) {
      int smallestInRow = 10000;
      for (int j = 0; j < column; j++) {
        if (hm.get(i)[j] < smallestInRow) {
          smallestInRow = hm.get(i)[j];
        }
      }
      smallest[i-1] = smallestInRow;
    }

    int result = -1;
    for (int num : smallest) {
      if (num > result) {
        result = num;
      }
    }

    System.out.println(result);
    sc.close();
  }
}