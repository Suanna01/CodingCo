import java.io.*;
import java.util.*;

public class Main {
    // 10*10 크기의 미로 상자의 구조와 먹이의 위치가 입력된다. v
    // 성실한 개미가 이동한 경로를 9로 표시해 출력한다.
    // 0(갈 수 있는 곳), 1(벽 또는 장애물), 먹이가 2
    // 개미는 (2, 2)에서 출발
    // 종료 조건 :
    //      맨 아래의 가장 오른쪽에 도착한 경우, 더 이상 움직일 수 없는 경우, 먹이를 찾은 경우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] a = new int[10][10];

        for (int i = 0; i<10; i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            for (int j = 0;j<10;j++){
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int x = 1;
        int y = 1;

        while(true){
            //먹이를 찾은 경우
            if (a[x][y]==2){
                a[x][y]=9;
                break;
            }

            a[x][y] = 9; //이동한 경로 표시

            // 개미는 오른쪽 또는 아래쪽으로만 움직임

            // [오른쪽 이동] 갈 수 있는 곳이면 다음 반복문에 그곳으로 이동
            if(a[x][y+1]==0 || a[x][y+1]==2){
                y++;
            }
            // [아래로 이동]
            else if(a[x][y+1]==1){
                if (a[x+1][y]==0||a[x+1][y]==2){
                    x++;
                }
                // 오른쪽, 아래로도 이동 안되는 경우
                else if (a[x+1][y] == 1)
                    break;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                bw.write(a[i][j] + " ");
            }
            bw.write("\n");
        }


        bw.flush();
    }
}
