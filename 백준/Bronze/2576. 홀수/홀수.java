import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int a = 0;
        
        for (int i =0; i<7; i++){
            a = Integer.parseInt(br.readLine());
            if(a%2==1){
                sum+=a;
                if (a<=min) min = a;
            }
        }
        
        if (sum>0) { 
            System.out.println(sum);
            System.out.println(min);
        }
        else System.out.println(-1);
    }
}