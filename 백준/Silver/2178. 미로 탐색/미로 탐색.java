import java.io.*;
import java.util.*;

public class Main{
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] maze = new int[n][m];

        // 입력
        for (int i = 0; i < n; i++){
            String line = br.readLine();
            for (int j = 0; j < m; j++){
                maze[i][j] = line.charAt(j) - '0';
            }
        }

        boolean[][] visited = new boolean[n][m];

        Queue<int[]> queue = new LinkedList<>();

        // 시작점 (0,0)은 큐에 넣고 방문처리
        visited[0][0] = true;
        queue.offer(new int[]{0, 0});

        // bfs
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];

            // 네 방향 확인
            for (int d = 0; d < 4; d++){
                int nx = x + dx[d];
                int ny = y + dy[d];

                // 1. 범위 확인
                if (nx < 0 || ny < 0 || nx >=n || ny >= m){
                    continue;
                }
                // 2. 방문하지 않았는지 (true면 방문했던 것.)
                if (visited[nx][ny]) {
                    continue;
                }
                // 3. 이동 가능한지 (0이면 이동 불가능)
                if (maze[nx][ny] == 0) {
                    continue;
                }

                // 이동 가능할 때.
                visited[nx][ny] = true;  // 방문처리
                maze[nx][ny] = maze[x][y] + 1;  // 거리갱신
                queue.offer(new int[]{nx, ny});  // 큐에 삽입

            }
        }

        System.out.println(maze[n-1][m-1]);
    }
}