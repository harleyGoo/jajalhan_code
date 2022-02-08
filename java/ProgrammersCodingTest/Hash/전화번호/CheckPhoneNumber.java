package java.ProgrammersCodingTest.Hash.전화번호;

import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    String[] phone_book = {"119", "112", "119123"};

    boolean answer = true;

    // for (int i = 0; i < phone_book.length - 1; i++) {
    //     for (int j = i+1; j < phone_book.length; j++) {
    //         if (phone_book[j].startsWith(phone_book[i])) {
    //             answer = false;
    //         } else if (phone_book[i].startsWith(phone_book[j])) {
    //             answer = false;
    //         }
    //     }
    // }
    
    Arrays.sort(phone_book);
    for (int i = 0; i < phone_book.length - 1; i++) {
        if (phone_book[i+1].startsWith(phone_book[i])) {
            answer = false;
        }
    }

    System.out.println(answer);

  }
}