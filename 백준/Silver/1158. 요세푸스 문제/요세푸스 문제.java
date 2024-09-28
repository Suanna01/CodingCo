import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        
        ArrayList<Integer> a = new ArrayList<>();
        
        for (int i = 1; i<=n; i++){
            a.add(i);
        }
        
        int index = 0;
        
        sb.append("<");
        
        while(a.size()>=1){
            index = (index + k - 1) % a.size();
            sb.append(a.remove(index));
            
            if (a.size()>=1) {
                sb.append(", ");
            }
        }
        sb.append(">");
        
        System.out.println(sb);
        br.close();
        
    }
}