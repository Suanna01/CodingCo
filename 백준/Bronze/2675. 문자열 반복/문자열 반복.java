import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i<n; i++){
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            for (int j = 0; j<s[1].length(); j++){
                for (int k=0; k<a; k++) {
                    sb.append(s[1].charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
        
    }
}