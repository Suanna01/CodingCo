import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine()); 
        int[] a = new int[n];
        
        for (int i = 0; i<n; i++){ 
            ArrayList<Integer> aa = new ArrayList<>();
            a[i]=Integer.parseInt(br.readLine()); 
            
            while(a[i]>=2){
                aa.add(a[i]%2);
                a[i]/=2;
            }
            
            aa.add(a[i]);
            
            for (int j = 0; j<aa.size(); j++){
                if(aa.get(j)==1) bw.write(j+" ");
            }
            bw.write("\n");
        }
        
        bw.flush();
        br.close();
        
    }
}