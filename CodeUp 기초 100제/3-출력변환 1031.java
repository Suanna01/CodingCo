import java.io.*;

public class Main {
    //10진 정수 1개 입력받아 8진수로 출력하기
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        System.out.printf("%o",a);
    }
}
