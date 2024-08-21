import java.io.*;

public class Main {
    //정수 1개를 입력받아 2배 곱해 출력해보자.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

//        a<<1 : 2배
//        a>>1 : 반으로 나눈 값
//        a<<2 : 4배
//        a>>2 : 반으로 나눈 후 다시 반으로 나눈 값
//        a<<b : 2^b배

        System.out.println(a<<1);
    }
}
