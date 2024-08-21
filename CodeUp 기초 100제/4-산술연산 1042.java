import java.io.*;

public class Main {
    //정수 2개(a, b) 를 입력받아 a를 b로 나눈 몫을 출력해보자.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        System.out.printf("%d", Integer.parseInt(a[0])/Integer.parseInt(a[1]));
    }
}
