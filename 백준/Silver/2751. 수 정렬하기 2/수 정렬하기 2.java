import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        // int[] a = new int[n];
        List<Integer> a = new ArrayList<>();
        
        for (int i = 0; i<n; i++){
            // a[i]=Integer.parseInt(br.readLine());
            a.add(Integer.parseInt(br.readLine()));
        }
        
        // Arrays.sort(a);
        Collections.sort(a);
        
        for (int i = 0; i<n; i++){
            sb.append(a.get(i)+"\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}