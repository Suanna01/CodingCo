import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        
        for (int i = 0; i<n; i++){
            String[] s = br.readLine().split(" ");
            
            if (s[0].contains("push_front")){
                dq.addFirst(Integer.parseInt(s[1]));
            } 
            else if (s[0].contains("push_back")){
                dq.addLast(Integer.parseInt(s[1]));
            } 
            else if (s[0].contains("pop_front")){
                if (dq.isEmpty()) sb.append("-1\n");
                else sb.append(dq.pollFirst()+"\n");
            }
            else if (s[0].contains("pop_back")){
                if (dq.isEmpty()) sb.append("-1\n");
                else sb.append(dq.pollLast()+"\n");
            }
            else if (s[0].contains("size")){
                sb.append(dq.size()+"\n");
            }
            else if (s[0].contains("empty")){
                if (dq.isEmpty()) sb.append("1\n");
                else sb.append("0\n");
            }
            else if (s[0].contains("front")){
                if (dq.isEmpty()) sb.append("-1\n");
                else sb.append(dq.peekFirst()+"\n");
            }
            else if (s[0].contains("back")){
                if (dq.isEmpty()) sb.append("-1\n");
                else sb.append(dq.peekLast()+"\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}