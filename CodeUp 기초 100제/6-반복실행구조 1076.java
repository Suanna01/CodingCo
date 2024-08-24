import java.io.*;

public class Main {
    // 영문자(a ~ z) 1개가 입력되었을 때 그 문자까지의 알파벳을 순서대로 출력해보자.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = br.readLine().charAt(0);
        char a = 'a';
        do {
            System.out.print(a+" ");
            a++;
        } while(a<=c);
    }
}
