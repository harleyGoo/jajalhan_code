package java.bigInt;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String firstInput = sc.nextLine();
    String[] firstInputList = firstInput.split(" ");
    int n = Integer.parseInt(firstInputList[0]);
    int m = Integer.parseInt(firstInputList[1]);
    int k = Integer.parseInt(firstInputList[2]);

    String secondInput = sc.nextLine();
    String[] tmpSecondInputList = secondInput.split(" ");
    int[] secondInputList = new int[tmpSecondInputList.length];

    for (int i = 0; i < n; i++) {
      secondInputList[i] = Integer.parseInt(tmpSecondInputList[i]);
    }

    // 입력받은 수 정렬하기
    int tmp;
    for (int i = 0; i < secondInputList.length - 1; i++) {
      for (int j = i+1; j < secondInputList.length; j++) {
        if (secondInputList[i] < secondInputList[j]) {
          tmp = secondInputList[j];
          secondInputList[j] = secondInputList[i];
          secondInputList[i] = tmp;
        }
      }
    }

    int first = secondInputList[0];
    int second = secondInputList[1];
    int result = 0;

    // 가장 큰 수가 더해지는 횟수 계산
    while (true) {
      for (int i = 0; i < k; i++) {
        if (m == 0) {  // m이 0이라면 반복문 탈출
          break;        
        }
        result += first;
        m -= 1;  // 더할 때마다 1씩 빼기
      }
      if (m == 0) {
        break;
      }
      result += second;  // 두 번째로 큰 수를 한 번 더하기
      m -= 1;  // 더할 때마다 1씩 빼기
    }

    System.out.println(result);
    sc.close();
  }
}