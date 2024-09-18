import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 1; i<=n; i++){
            for (int j = 0; j<n-i; j++){
                sb.append(" ");
            }
            for (int j = 0; j<i+i-1; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }
}