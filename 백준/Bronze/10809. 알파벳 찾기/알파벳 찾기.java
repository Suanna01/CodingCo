import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String s = br.readLine();
        char[] c = s.toCharArray();
        
        char[] a = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        for (int i = 0; i<a.length; i++){
            int count = 0;
            for (int j = 0; j<c.length; j++){
                if (a[i]==c[j]) {
                    sb.append(j+" ");
                    break;
                }
                else count++;
            }
            
            if (count==c.length) sb.append("-1 ");
        }
        System.out.println(sb);
        
    }
}