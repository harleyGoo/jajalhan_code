package java.leetcode;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/description/
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// An input string is valid if:
//   1. Open brackets must be closed by the same type of brackets.
//   2. Open brackets must be closed in the correct order.
//   3. Every close bracket has a corresponding open bracket of the same type.

public class validParentheses {

  public boolean isValid(String s) {
    String[] sl = s.split("");
    int len = sl.length;
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < len; i++) {
      char curn = s.charAt(i);

      if (curn == '(' || curn == '{' || curn == '[') {
        // 열기 괄호의 경우 stack에 넣기
        stack.push(curn);
      } else if (stack.size() == 0) {
        // 열기 괄호가 없어서 stack의 사이즈가 0인 경우
        // (닫기 괄호만 존재하는 경우)
        return false;
      } else if(curn == ')') {
        if(stack.pop() != '(') {
          return false;
        }
      } else if(curn == '}') {
        if(stack.pop() != '{') {
          return false;
        }
      } else if(curn == ']') {
        if(stack.pop() != '[') {
          return false;
        }
      }
    }

    return stack.size() == 0;
  }
}

// 참고: https://devraphy.tistory.com/560


/* 내가 작성했던 코드
*  이 경우, s = "([)]" 혹은 s = "]" 처럼 유효하지 않은 괄호의 경우에도 true를 반환하게 됨.
*/

// class Solution {
//   public boolean isValid(String s) {if (s.contains("(")) {
//       if (!s.contains(")")) {
//         return false;
//       }
//     }
//     if (s.contains("[")) {
//       if (!s.contains("]")) {
//         return false;
//       }
//     }
//     if (s.contains("{")) {
//       if (!s.contains("}")) {
//         return false;
//       }
//     }
//   }
// }