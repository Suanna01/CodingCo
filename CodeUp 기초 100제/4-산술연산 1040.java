import java.io.*;

public class Main {
    //입력된 정수의 부호를 바꿔 출력
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        System.out.println(-a); //단항 연산자인 negative(-) 연산자 붙이면 됨.
    }
}
