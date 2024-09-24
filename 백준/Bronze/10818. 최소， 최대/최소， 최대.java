import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] a = new int[n];
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i<n; i++){
            a[i]=Integer.parseInt(s[i]);
            if (a[i]<=min) min = a[i];
            if (a[i]>=max) max = a[i];
        }
        
        System.out.println(min+" "+max);
    }
}