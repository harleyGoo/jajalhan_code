package java.leetcode;

// https://leetcode.com/problems/reverse-integer/description/
// medium.
// Given a signed 32-bit integer x, return x with its digits reversed.
// If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

public class reverseInteger {
  public int reverse(int x) {
    int res = 0;
    boolean isNegative = x < 0;
    String strX = String.valueOf(Math.abs(x));
    StringBuilder sb = new StringBuilder(strX).reverse();
    
    try {
      res = Integer.parseInt(sb.toString());
    } catch (NumberFormatException e) {
      return 0;
    }

    return isNegative ? -res : res;
  }
}

// 내가 푼 소스(11ms)
  // public int reverse(int x) {
  //   StringBuilder sb = new StringBuilder();
  //   String strX = x + "";
  //   String[] arrayX = strX.split("");
  //   boolean isNegative = false;
  //   for (int i = 0; i < arrayX.length; i++) {
  //     if (arrayX[i].equals("-")) {
  //       isNegative = true;
  //     } else {
  //       sb.append(arrayX[i]);
  //     }
  //   }
  //   sb.reverse();
  //   String str = sb.toString();
  //   if (isNegative) {
  //     str = "-" + str;
  //   }
  //   double doubleStr = Double.parseDouble(str);
  //   if (doubleStr >= Integer.MAX_VALUE || doubleStr < Integer.MIN_VALUE) {
  //     return 0;
  //   }
  //   int result = Integer.parseInt(str);
  //   return result;
  // }
