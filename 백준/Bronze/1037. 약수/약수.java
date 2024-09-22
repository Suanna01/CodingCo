import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] d = new int[n];
        String[] dd = br.readLine().split(" ");
        
        int max = -1;
        
        for(int i = 0; i<dd.length; i++){
            d[i] = Integer.parseInt(dd[i]);
        }
        
        Arrays.sort(d);

        if (d.length%2==0) System.out.println(d[0]*d[d.length-1]);
        else System.out.println(d[d.length/2]*d[d.length/2]);
        
    }
}