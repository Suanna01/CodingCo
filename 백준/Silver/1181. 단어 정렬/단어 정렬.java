import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        Set<String> s = new HashSet<>();
        
        for (int i = 0; i<n; i++) {
            String S = br.readLine();
            s.add(S);
        }
        
        List<String> ss = new ArrayList<>(s);
        
        Collections.sort(ss, (a,b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(a.length(), b.length());
            }
            return a.compareTo(b);
        });
        
        for (String SS : ss){
            sb.append(SS+'\n');
        }
        
        System.out.println(sb);
    }
}