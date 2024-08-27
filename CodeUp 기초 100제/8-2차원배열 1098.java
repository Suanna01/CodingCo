import java.io.*;

public class Main {
    /*
    첫 줄에 격자판의 세로(h), 가로(w) 가 공백을 두고 입력되고,
    두 번째 줄에 놓을 수 있는 막대의 개수(n)
    세 번째 줄부터 각 막대의 길이(l), 방향(d), 좌표(x, y)가 입력된다. 단, d = 0 or 1
     */
    //막대에 의해 가려진 경우 1, 아닌 경우 0으로 출력한다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int h = Integer.parseInt(s[0]);
        int w = Integer.parseInt(s[1]);

//        int n = Integer.parseInt(br.readLine()); //NumberFormatException
        String[] S = br.readLine().split(" ");
        int n = Integer.parseInt(S[0]);  // 입력의 첫 번째 값만 정수로 변환

        // 2차원 배열 생성
        int[][] a = new int[h][w];

        for (int i = 0; i<n; i++){
            String[] ss = br.readLine().split(" ");

            int l = Integer.parseInt(ss[0]);
            int d = Integer.parseInt(ss[1]);
            int x = Integer.parseInt(ss[2])-1;
            int y = Integer.parseInt(ss[3])-1;

            if (x >= 0 && x < h && y >= 0 && y < w) { // 유효한 범위 내에서 배열에 값을 설정

                // 막대 넓이 d가 0일때 == 가로로 놓일때(x고정)
                if (d==0){
                    for (int j = y; j<y+l; j++){
                        a[x][j] = 1;
                    }
                }
                // 막대 넓이 d가 1일때 == 세로로 놓일때(y고정)
                else {
                    for (int j = x; j<x+l; j++){
                        a[j][y] = 1;
                    }
                }

            }

        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                bw.write(a[i][j] + " ");
            }
            bw.write("\n");
        }

        bw.flush();

    }
}
