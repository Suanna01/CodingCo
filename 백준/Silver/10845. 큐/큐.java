import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        Queue<Integer> q = new LinkedList<>();
        
        int a = 0;
        
        for (int i = 0; i<n; i++){
            String s = br.readLine();
            
            if (s.contains("push")){
                String[] ss = s.split(" ");
                a = Integer.parseInt(ss[1]);
                q.add(a);
            } 
            else if (s.contains("pop")){
                if (q.isEmpty()) sb.append("-1\n");
                else sb.append(q.poll()+"\n");
            }
            else if (s.contains("size")){
                sb.append(q.size()+"\n");
            }
            else if (s.contains("empty")){
                if (q.isEmpty()) sb.append("1\n");
                else sb.append("0\n");
            }
            else if (s.contains("front")){
                if (q.isEmpty()) sb.append("-1\n");
                else sb.append(q.peek()+"\n");
            }
            else if (s.contains("back")){
                if (q.isEmpty()) sb.append("-1\n");
                else sb.append(a+"\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}