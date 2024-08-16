import java.io.*;

public class Main {
    //int형 정수 1개를 입력받아 공백을 사이에 두고 3번 출력해보자.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        System.out.println(a+" "+a+" "+a);
    }
}
