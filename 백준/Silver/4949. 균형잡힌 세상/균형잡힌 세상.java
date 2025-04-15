import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while(!(line=br.readLine()).equals(".")){
            Stack<Character> stack = new Stack<>();
            boolean isBalanced=true;

            for (char ch : line.toCharArray()){
                if (ch=='(' || ch=='['){
                    stack.push(ch);
                }
                else if (ch==')'){
                    if(stack.isEmpty() || stack.pop()!='('){
                        isBalanced=false;
                        break;
                    }
                }
                else if (ch==']'){
                    if(stack.isEmpty() || stack.pop()!='['){
                        isBalanced=false;
                        break;
                    }
                }
            }

            if (!stack.isEmpty()){
                isBalanced=false;
            }

            System.out.println(isBalanced?"yes":"no");
        }

    }
}