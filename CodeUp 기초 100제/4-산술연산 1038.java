import java.io.*;

public class Main {
    //공백으로 구분되어 입력되는 정수 2개를 입력받아 합을 출력하는 프로그램을 작성해보자.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");

        System.out.printf("%d", Long.parseLong(a[0])+Long.parseLong(a[1]));
    }
}
