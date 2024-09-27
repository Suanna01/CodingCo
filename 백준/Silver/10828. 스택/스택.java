import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i<n; i++){
            String s = br.readLine();
            if (s.contains("push")){
                String[] ss = s.split(" ");
                stack.push(Integer.parseInt(ss[1]));
            } 
            else if (s.contains("pop")){
                if (stack.empty()) sb.append("-1\n");
                else sb.append(stack.pop()+"\n");
            }
            else if (s.contains("size")){
                sb.append(stack.size()+"\n");
            }
            else if (s.contains("empty")){
                if (stack.empty()) sb.append("1\n");
                else sb.append("0\n");
            }
            else if (s.contains("top")){
                if (stack.empty()) sb.append("-1\n");
                else sb.append(stack.peek()+"\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}