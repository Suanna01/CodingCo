import java.io.*;

public class Main {
    //정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자. 0까지.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        while (a>0){
            System.out.println(--a);
        }
    }
}
