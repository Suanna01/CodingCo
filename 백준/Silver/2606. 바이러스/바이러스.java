import java.io.*;
import java.util.*;

public class Main{
    
    static boolean[][] a;
    static int n;
    static boolean[] b;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        
        a = new boolean[n+1][n+1];
        b = new boolean[n+1];
        
        for (int i = 1; i<=e; i++){
            st = new StringTokenizer(br.readLine());
            int aa  = Integer.parseInt(st.nextToken());
            int bb = Integer.parseInt(st.nextToken());
            a[aa][bb] = a[bb][aa] = true;
        }
        
        b[1]=true;
        
        dfs(1);
        
        int count = 0;
        for (int i = 1; i<=n; i++){
            if (b[i]==true) count++;
        }
        System.out.println(count-1);
    }
    public static void dfs(int node){
        for (int i=1; i<=n; i++){
            if (a[node][i]==true && b[i]!=true){
                b[i]=true;
                dfs(i);
            }
            
        }
    }
}