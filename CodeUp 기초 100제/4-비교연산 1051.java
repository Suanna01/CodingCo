import java.io.*;

public class Main {
    //b가 a보다 크거나 같으면 1을, 그렇지 않으면 0을 출력
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        if (b>=a) System.out.println(1);
        else System.out.println(0);
    }
}
