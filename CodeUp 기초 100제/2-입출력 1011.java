import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String X = br.readLine();  //readLine()은 스트링으로 받음
        char x = X.charAt(0);

        System.out.println(x);
    }
}
