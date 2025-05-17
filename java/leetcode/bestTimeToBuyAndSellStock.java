package java.leetcode;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
// Easy.
// You are given an array prices where prices[i] is the price of a given stock on the ith day.
// You want to maximize your profit by choosing a single day to buy one stock
// and choosing a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

public class bestTimeToBuyAndSellStock {
  public int maxProfit(int[] prices) {
    int buyingPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for (int i = 0; i < prices.length; i++) {
      buyingPrice = Math.min(buyingPrice, prices[i]);
      maxProfit = Math.max(maxProfit, prices[i] - buyingPrice);
    }
    return maxProfit;
  }
}

// 다른 사람 풀이
// public int maxProfit(int[] prices) {
//   int lsf = Integer.MAX_VALUE;
//   int op = 0;
//   int pist = 0;

//   for(int i = 0; i < prices.length; i++) {
//     if(prices[i] < lsf){
//         lsf = prices[i];
//     }
//     pist = prices[i] - lsf;
//     if(op < pist){
//       op = pist;
//     }
//   }
//   return op;
// }