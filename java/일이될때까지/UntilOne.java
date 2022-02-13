package java.일이될때까지;

import java.util.Scanner;

public class UntilOne {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] input = sc.nextLine().split(" ");
    
    int n = Integer.parseInt(input[0]);
    int k = Integer.parseInt(input[1]);
    int result = 0;

    while (n != 1) {
      if (n % k == 0) {
        n /= k;
        result += 1;
      } else {
        n -= 1;
        result += 1;
      }
    }

    System.out.println(result);
    sc.close();
  }
}
