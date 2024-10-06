import java.io.*;
import java.util.*;

public class Main{
    
    static int[][] a;
    static int n;
    static int[] b;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        
        a = new int[n+1][n+1];
        b = new int[n+1];
        
        for (int i = 1; i<=e; i++){
            st = new StringTokenizer(br.readLine());
            int aa  = Integer.parseInt(st.nextToken());
            int bb = Integer.parseInt(st.nextToken());
            a[aa][bb] = a[bb][aa] = 1;
        }
        
        b[1]=1;
        
        dfs(1);
        
        int count = 0;
        for (int i = 1; i<=n; i++){
            if (b[i]==1) count++;
        }
        System.out.println(count-1);
    }
    public static void dfs(int node){
        for (int i=1; i<=n; i++){
            if (a[node][i]==1 && b[i]!=1){
                b[i]=1;
                dfs(i);
            }
            
        }
    }
}