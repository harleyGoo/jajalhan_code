package java.GetCoinCnt;

class Main {
  public static void main(String[] args) {
    int n = 1260;
    int[] coin_type = { 500, 100, 50, 10 };
    int coin_cnt = 0;
    for (int i : coin_type) {
      coin_cnt += n / i;
      n %= i;
    }

    System.out.println("동전의 갯수: " + coin_cnt);
  }
}
