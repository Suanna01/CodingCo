import java.io.*;

public class Main {
    //입력된 두 정수 a, b 중 큰 값을 출력하는 프로그램을 작성해보자.
    //단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        System.out.println((a>b?a:b));
    }
}
