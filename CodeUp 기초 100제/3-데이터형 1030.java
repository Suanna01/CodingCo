import java.io.*;

public class Main {
    //정수 1개가 입력된다.
    //단, 입력되는 정수의 범위는 -9223372036854775808 ~
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long a = Long.parseLong(br.readLine());
        System.out.println(a);
    }
}
