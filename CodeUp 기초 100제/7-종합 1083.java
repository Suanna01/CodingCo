import java.io.*;

public class Main {
    //1 부터 그 수까지 순서대로 공백을 두고 수를 출력하는데,
    //3 또는 6 또는 9인 경우 그 수 대신 영문 대문자 X 를 출력한다.
    //10 보다 작은 정수 1개가 입력된다.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for (int i =1; i<=a; i++){
            if (i%3==0) System.out.print("X ");
            else System.out.printf("%d ", i);
        }
    }
}
