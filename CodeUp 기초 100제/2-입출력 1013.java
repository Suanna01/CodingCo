import java.io.*;
import java.util.*;

public class Main {
    //정수(int) 2개를 입력받아 그대로 출력해보자.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String Tokenizer 사용
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a+" "+b);
    }
}
