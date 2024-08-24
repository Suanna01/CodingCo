import java.io.*;

public class Main {
    //정수(0 ~ 100) 1개를 입력받아 0부터 그 수까지 순서대로 출력해보자.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for (int i = 0;i<=a; i++){
            System.out.println(i);
        }
    }
}
