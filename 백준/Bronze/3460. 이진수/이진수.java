import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine()); 
        // int[] a = new int[n];
        
        for (int i = 0; i<n; i++){ 
            // ArrayList<Integer> aa = new ArrayList<>();
            // a[i]=Integer.parseInt(br.readLine()); 
            int a = Integer.parseInt(br.readLine());
            int index = 0;
            
            while(a>0){
                if(a % 2 != 0){
                    sb.append(index + " ");
                }
                a/=2;
                index++;
            }
            
            sb.append("\n");
        }
        
        System.out.println(sb);
        
    }
}