import java.io.*;
import java.util.*;

public class Main {
    //2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        System.out.println(b+" "+a);

    }
}
