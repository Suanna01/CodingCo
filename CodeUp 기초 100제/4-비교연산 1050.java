import java.io.*;

public class Main {
    //a와 b가 같으면 1을, 같지 않으면 0을 출력
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        if (a==b) System.out.println(1);
        else System.out.println(0);
    }
}
