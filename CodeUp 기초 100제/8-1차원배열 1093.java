import java.io.*;

public class Main {
    //첫 번째 줄에 출석 번호를 부른 횟수인 정수 n이 입력된다. (1 ~ 10000)
    //두 번째 줄에는 무작위로 부른 n개의 번호(1 ~ 23)가 입력된다.
    //1번부터 번호가 불린 횟수를 순서대로 공백으로 구분하여 한 줄로 출력한다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] a = br.readLine().split(" ");
        int[] b = new int[23];

        for (int i = 0; i<n; i++){
            b[Integer.parseInt(a[i])-1]++;
        }

        for (int i = 0; i<23;i++){
            bw.write(String.format("%s ", b[i]));
        }
        bw.flush();

    }
}
