import java.io.*;

public class Main {
    //A, B, C, D, E, F 중 하나가 입력될 때,
    //1부터 F까지 곱한 16진수 구구단의 내용을 출력해보자.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine(), 16);  //16진수 변환
        for (int i = 1; i<16; i++){
            System.out.printf("%X*%X=%X\n", a, i, a*i);
            //%x	printf("%x", 10);	16진수의 정수, 알파벳 소문자
            //%X	printf("%X", 10);	16진수의 정수, 알파벳 대문자
            //%o	printf("%o", 10);	8진수의 정수
        }
    }
}
