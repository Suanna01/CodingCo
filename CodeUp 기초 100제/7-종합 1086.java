import java.io.*;

public class Main {
    // 입력 : w, h, b 가 공백을 두고 입력된다.
    // 출력 : w*h*b
    // MB단위로 출력하고 둘째 자리까지 출력
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] a= br.readLine().split(" ");

        float w = Float.parseFloat(a[0]);
        float h = Float.parseFloat(a[1]);
        float b = Float.parseFloat(a[2]);

        bw.write(String.format("%.2f MB", (w*h*b)/8/1024/1024));
        bw.flush();
    }
}