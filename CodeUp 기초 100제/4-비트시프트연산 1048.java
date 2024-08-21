import java.io.*;

public class Main {
    //정수 2개(a, b)를 입력받아 a를 2^b배 곱한 값으로 출력해보자.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        System.out.println(a << b);
    }
}
