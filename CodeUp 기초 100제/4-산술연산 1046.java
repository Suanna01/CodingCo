import java.io.*;

public class Main {
    //정수 3개를 입력받아 합과 평균을 출력해보자.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);

        System.out.println(a+b+c);
        System.out.printf("%.1f",(float) (a+b+c)/3);
    }
}
