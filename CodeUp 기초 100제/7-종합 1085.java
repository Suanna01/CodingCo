import java.io.*;

public class Main {
    // 입력
    // 1초 동안 마이크로 소리강약을 체크하는 수를 h
    // 한 번 체크한 결과를 저장하는 비트!! b
    // 좌우 등 소리를 저장할 트랙 개수인 채널 c
    // 녹음할 시간 s
    // 출력 : 필요한 저장 용량을 계산 (저장용량 = h*b*c*s)
    // 출력은 bit가 아닌 byte로 나타내므로 /8을 해주어야 함!
    // 첫째 자리까지 출력
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] a = br.readLine().split(" ");
        double h = Integer.parseInt(a[0]);
        double b = Integer.parseInt(a[1]);
        double c = Integer.parseInt(a[2]);
        double s = Integer.parseInt(a[3]);

        bw.write(String.format("%.1f", (h*b*c*s)/8/1024/1024)+" MB");
        bw.flush();
    }
}
