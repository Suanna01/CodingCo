import java.io.*;

public class Main {
    //1(true, 참) 또는 0(false, 거짓) 이 입력되었을 때 반대로 출력
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        if (a==1) System.out.println(0);
        else System.out.print(1);
    }
}
