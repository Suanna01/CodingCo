import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            
            String[] s = br.readLine().split(" ");
            int[] p = new int[N];
            
            Queue<Integer> q = new LinkedList<>();
            
            for (int j = 0; j<N; j++){
                q.add(Integer.parseInt(s[j]));
                p[j] = Integer.parseInt(s[j]);
            }
            
            Arrays.sort(p);
            
            for (int j = 0; j<p.length/2; j++){
                int temp = p[j];
                p[j] = p[p.length-1-j];
                p[p.length-1-j] = temp;
            }
            
            
            int first = p[0], count = 0;
            
            while(!q.isEmpty()){
                int a = q.poll();
                l--;
                
                if (a==first){
                    count++;
                    if (l==-1) {
                        System.out.println(count);
                        break;
                    }
                    first = p[count];
                }
                else {
                    q.add(a);
                    if (l==-1) l = q.size() - 1;
                }
            }
            
        }
        
    }
}
