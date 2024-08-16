import java.io.*;

public class Main {
    //10진 정수 1개(0 ~ 255 범위)가 입력받아 아스키코드 문자로 출력하기
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        System.out.printf("%c", a); //자동형변환
    }
}
