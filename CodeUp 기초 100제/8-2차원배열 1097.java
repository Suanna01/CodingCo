import java.io.*;

public class Main {
    /*
    바둑알이 깔려 있는 상황이 19 * 19 크기의 정수값으로 입력된다. v
    십자 뒤집기 횟수(n)가 입력된다.v
    십자 뒤집기 좌표가 횟수(n) 만큼 입력된다. 단, n은 10이하의 자연수이다.v
     */
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] a = new int[19][19];

        for (int i = 0; i<19; i++){
            String[] s = br.readLine().split(" ");
            for (int j = 0; j<19; j++){
                a[i][j] = Integer.parseInt(s[j]);
            }
        }

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i<n; i++){
            String[] ss = br.readLine().split(" ");
            int x = Integer.parseInt(ss[0]) -1;
            int y = Integer.parseInt(ss[1]) -1;
            for(int j=0; j<19; j++) //가로 줄 바꾸기
            {
                if(a[x][j]==1) a[x][j]= 0;
                else a[x][j]= 1;
            }
            for(int j=0; j<19; j++) //세로 줄 바꾸기
            {
                if(a[j][y]==1) a[j][y]=0;
                else a[j][y] = 1;
            }
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
