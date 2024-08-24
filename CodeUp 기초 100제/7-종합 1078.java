import java.io.*;

public class Main {
    // 정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = 0;
        for (int i = 1; i<=a; i++){
            if (i%2==0) b+=i;
        }
        System.out.println(b);
    }
}
