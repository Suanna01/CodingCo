import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int f = 1;
        
        for (int i = 1; i<=a; i++){
            f*=i;
        }
        
        System.out.println(f);
    }
}