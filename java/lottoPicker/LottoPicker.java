package java.lottoPicker;

import java.util.Scanner;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class LottoPicker {
  public static void main(String[] args) {
    // 출력해야할 숫자의 갯수 입력받기
    Scanner sc = new Scanner(System.in);
    Integer input = sc.nextInt();
    sc.close();

    Set<Integer> lotto = new HashSet<>();
    if (input > 0) {
      Random random = new Random();
      while (true) {
        lotto.add(random.nextInt(45) + 1);

        if (lotto.size() == input) {
          break;
        }
      }
      for (Integer num : lotto) {
        System.out.print(num + " ");
      }
    }
  }
}
