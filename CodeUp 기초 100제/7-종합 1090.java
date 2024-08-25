import java.io.*;

public class Main {
    // 입력 : 시작 값(a), 등비의 값(r), 몇 번째 인지를 나타내는 정수(n)
    // 출력 : n
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        long a = Integer.parseInt(s[0]);
        long r = Integer.parseInt(s[1]);
        long n = Integer.parseInt(s[2]);

        for (int i = 1; i<n; i++){
            a *= r;
        }
        bw.write(String.valueOf(a));
        bw.flush();
    }
}
