import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i<n; i++){
            String s = br.readLine();
            String[] ss = s.split(" ");
            for (int j = 0; j<ss.length; j++){
                String[] S = ss[j].split("");
                for (int k = S.length-1; k>=0; k--){
                    sb.append(S[k]);
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        
    }
}