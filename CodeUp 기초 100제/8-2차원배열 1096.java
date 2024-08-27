import java.io.*;

public class Main {
    /*
    바둑판에 올려 놓을 흰 돌의 개수(n)가 첫 줄에 입력된다.
    둘째 줄 부터 n+1 번째 줄까지 힌 돌을 놓을 좌표(x, y)가 n줄 입력된다.
    n은 10이하의 자연수이고 x, y 좌표는 1 ~ 19 까지이며, 같은 좌표는 입력되지 않는다.
     */
    /*
    흰 돌이 올려진 바둑판의 상황을 출력한다.
    흰 돌이 있는 위치는 1, 없는 곳은 0으로 출력한다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] a = new int[19][19]; // 0으로 초기화된 2차원 배열 생성

        for (int i=0;i<n;i++){
            String[] s = br.readLine().split(" ");
            a[Integer.parseInt(s[0])-1][Integer.parseInt(s[1])-1] = 1;
        }

        for (int x=0; x<19; x++){
            for (int y=0; y<19; y++) {
                bw.write(String.format(a[x][y]+" "));
            }
            bw.write("\n");
        }

        bw.flush();
    }
}
