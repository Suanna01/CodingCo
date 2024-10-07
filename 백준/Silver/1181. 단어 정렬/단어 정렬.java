import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));        
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        String[] s = new String[n];
        
        for (int i = 0; i<n; i++) {
            s[i] = br.readLine();
        }
        
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String a, String b){
                if (a.length() == b.length()) {
                    return a.compareTo(b);
                }
                return a.length() - b.length();
            }
        });
        
        sb.append(s[0]+'\n');
        
        for (int i = 1; i<n; i++){
            if (!s[i].equals(s[i-1])) 
                sb.append(s[i]+'\n');
        }
        
        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }
}