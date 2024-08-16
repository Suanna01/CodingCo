import java.io.*;

public class Main {
    //8진 정수 1개 입력받아 10진수로 출력하기
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        int b = Integer.parseInt(a, 8); //8진수로 변환
        System.out.printf("%d", b);
    }
}
