import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N= Integer.parseInt(st.nextToken());
        int S= Integer.parseInt(st.nextToken());

        int[] arr= new int[N];
        st= new StringTokenizer(br.readLine());
        for (int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        int start=0;
        int end=0;
        int sum=0;
        int minLen= Integer.MAX_VALUE;

        while (true) {
            if (sum >= S) {
                minLen = Math.min(minLen, end - start);
                sum -= arr[start++];
            } else if (end < N) {
                sum += arr[end++];
            } else {
                break;
            }
        }

        System.out.println(minLen==Integer.MAX_VALUE? 0:minLen);
    }
}