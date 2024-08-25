import java.io.*;

public class Main {
    //입력 : 시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째 인지를 나타내는 정수(n)
    //출력 : n
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        long a = Long.parseLong(s[0]);
        long m = Long.parseLong(s[1]);
        long d = Long.parseLong(s[2]);
        long n = Long.parseLong(s[3]);

        for (int i = 1; i<n; i++){
            a = a*m+d;
        }

        bw.write(String.valueOf(a));
        bw.flush();
    }
}
