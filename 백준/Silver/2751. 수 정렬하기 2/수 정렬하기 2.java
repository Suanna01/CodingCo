import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        // int[] a = new int[n];
        // List<Integer> a = new ArrayList<>();
        boolean[] a = new boolean[2000001];
        
        for (int i = 0; i<n; i++){
            // a[i]=Integer.parseInt(br.readLine());
            a[Integer.parseInt(br.readLine())+1000000] = true;
        }
        
        // Arrays.sort(a);
        // Collections.sort(a);
        
        for (int i = 0; i<a.length; i++){
            // sb.append(a.get(i)+"\n");
            if (a[i]){
                sb.append(i-1000000+"\n");
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
