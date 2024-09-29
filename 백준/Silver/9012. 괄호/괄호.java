import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i<n; i++){
            Stack<Character> stack = new Stack<>();
            char[] c = br.readLine().toCharArray();

            for (int j = 0; j<c.length; j++){
                if (c[j]==')' && !stack.empty()) {
                    if (stack.peek()=='(') stack.pop();
                }
                else stack.push(c[j]);
            }
            if (stack.size()>0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}