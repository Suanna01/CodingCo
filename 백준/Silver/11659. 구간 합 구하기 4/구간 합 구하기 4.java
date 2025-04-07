import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int[] arr= new int[n+1]; //1번 인덱스부터 시작(구간합 계산 용이)
        for(int i =1; i<=n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        //누적합 배열
        int[] sum = new int[n+1];
        //sum[i] 는 1부터 i까지의 합
        for (int i = 1; i<=n; i++){
            sum[i]= sum[i-1] + arr[i];
        }
        
        for(int i =0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(sum[b]-sum[a-1]);
            
        }
        
        
    }
}