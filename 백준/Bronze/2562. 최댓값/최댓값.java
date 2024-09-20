import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] a = new int[9];
        
        // for (int i = 0; i<9; i++){
        //     a[i] = Integer.parseInt(br.readLine());
        // }
        
        // int max = 0;
        int max = Integer.MIN_VALUE;
        int index = -1;
        
        for (int i = 0; i<9; i++){
            a[i] = Integer.parseInt(br.readLine());
            if(a[i]>max) {
                max=a[i];
                index = i;
            }
        }
        
        bw.write(String.valueOf(max)+"\n");
        bw.write(String.valueOf(index+1));
        
        bw.flush();
        br.close();
        
        
    }
}