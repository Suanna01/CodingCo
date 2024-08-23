import java.io.*;

public class Main {
    //두 개의 참(1) 또는 거짓(0)이 입력될 때,
    //모두 참일 때에만 참을 출력하는 프로그램을 작성해보자.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

//        if (a==1 & b==1) System.out.println(1);
        System.out.println((a==1 && b==1)?1:0);  //삼항 연산자
    }
}
