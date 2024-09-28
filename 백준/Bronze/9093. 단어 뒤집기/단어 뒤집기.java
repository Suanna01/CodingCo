import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        for (int i = 0; i<n; i++){
            // String s = br.readLine();
            // String[] ss = s.split(" ");
            st = new StringTokenizer(br.readLine());
            int count = st.countTokens();
            for (int j = 0; j<count; j++){
                StringBuilder S = new StringBuilder(st.nextToken());
                // for (int k = S.length-1; k>=0; k--){
                //     sb.append(S[k]);
                // }
                sb.append(S.reverse()).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        
    }
}