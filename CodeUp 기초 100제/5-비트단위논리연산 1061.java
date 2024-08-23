import java.io.*;

public class Main {
    //입력된 정수 두 개를 비트단위로 or 연산한 후 그 결과를 정수로 출력해보자.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        System.out.println(a|b);
    }
}
