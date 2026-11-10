import java.util.*;

class Solution {
    boolean solution(String s) {
        /* 
        여는게 들어오면 스택에 넣기 and 닫는게 들어오면 스택에서 pop하기
        마지막에 스택에 남은게 있다면 false, 스택이 비어있으면 true 
        + pop할 때 비어있는지 체크: 비어있으면 false, 있으면 pop
        */
        
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                
                stack.pop();
            }
        }
        
        return stack.isEmpty();
    }
}