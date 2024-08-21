import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        //정수를 1개 입력받아 1만큼 더해 출력해보자.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        System.out.println((long) a+1);

    }
}
