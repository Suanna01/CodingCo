import java.io.*;

public class Main {
    //시작 값(a), 등차의 값(d), 몇 번째 수 인지를 의미하는 정수(n)가 입력됨.
    //n번째 수를 출력
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int d = Integer.parseInt(s[1]);
        int n = Integer.parseInt(s[2]);

        for (int i = 1; i<n; i++) {
            a += d;
        }

        bw.write(String.valueOf(a));
        bw.flush();
    }
}
