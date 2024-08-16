import java.io.*;

public class Main {
    //1개의 단어를 입력받아 그대로 출력해보자.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();

        System.out.println(a);
    }
}
