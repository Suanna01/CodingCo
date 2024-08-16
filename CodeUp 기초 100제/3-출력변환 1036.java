import java.io.*;

public class Main {
    //영문자 1개 입력받아 10진수로 출력
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 영문자 1개 입력받기
        char a = br.readLine().charAt(0);
        System.out.printf("%d", (int) a); //int형으로 캐스팅
        //Integer.parseInt()는 "숫자로 이루어진" 문자열을 인자로 받아 정수로 변환하는 메서드
    }
}
