import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr= new int[N];
        st= new StringTokenizer(br.readLine());
        for (int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        // 초기 윈도우
        int sum = 0;
        for (int i=0;i<K;i++){
            sum+=arr[i];
        }

        int max=sum;

        // 슬라이딩 윈도우: 윈도우를 한 칸씩 이동하며 갱신
        for (int i=K;i<N;i++){
            sum= sum-arr[i-K]+arr[i];
            max=Math.max(max,sum);
        }

        System.out.println(max);

    }
}