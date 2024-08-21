import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        //영문자 1개를 입력받아 그 다음 문자를 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char a = br.readLine().charAt(0); //문자 입력 받기
        char b = (char) (a + 1); // a+1은 정수형이 되기 때문에 이를 다시 문자형으로 변환 == 다음 문자
//        int c = a+1; //a가 'A'라면 c는 66임.

        System.out.println(b);
    }
}
