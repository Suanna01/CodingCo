import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()); 
        String[] s = br.readLine().split(" ");
        int[] a = new int[n];
        
        float max = Float.MIN_VALUE;

        for (int i = 0; i<n; i++){ 
            a[i]=Integer.parseInt(s[i]);
            if (a[i]>=max) max=a[i];
        }
        
        float sum = 0;
        for (int i =0; i<n; i++){
            sum+=a[i]/max*100;
        }
        
        System.out.println(sum/n);
        
    }
}