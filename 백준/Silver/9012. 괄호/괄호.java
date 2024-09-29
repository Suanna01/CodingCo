import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Character> stack;
        for (int i = 0; i<n; i++){
            stack = new Stack<>();
            // char[] c = br.readLine().toCharArray();
            String s = br.readLine();

            for (int j = 0; j<s.length(); j++){
                if (s.charAt(j)==')' && !stack.empty()) {
                    if (stack.peek()=='(') stack.pop();
                }
                else stack.push(s.charAt(j));
            }
            if (stack.size()>0) sb.append("NO\n");
            else sb.append("YES\n");
        }
        System.out.println(sb);
    }
}