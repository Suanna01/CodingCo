import java.io.*;

public class Main {
    //입력된 세 정수 a, b, c 중 가장 작은 값을 출력하는 프로그램을 작성해보자.
    //단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);
        System.out.println((a<b)?((a<c)?a:c):((b<c)?b:c));
    }
}
