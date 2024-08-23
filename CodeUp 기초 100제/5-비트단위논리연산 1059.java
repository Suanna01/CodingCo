import java.io.*;

public class Main {
    //입력 된 정수를 비트단위로 참/거짓을 바꾼 후 정수로 출력해보자.
    // == 입력된 정수를 비트 단위로 바꾼 후 0은 1로, 1은 0으로 바꾸고, 그 값을 10진수로 출력해라
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        System.out.println(~a);
    }
}
