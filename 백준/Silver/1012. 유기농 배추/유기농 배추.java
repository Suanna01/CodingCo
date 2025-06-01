import java.io.*;
import java.util.*;

public class Main{
    static int[] dx = {-1, 1, 0 ,0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        // 입력
        for (int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());  // 가로 길이
            int n = Integer.parseInt(st.nextToken());  // 세로 길이
            int k = Integer.parseInt(st.nextToken());  // 배추 개수

            int[][] baechu = new int[m][n];
            for (int j = 0; j < k; j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                baechu[x][y] = 1;
            }

            // 방문 체크 배열
            boolean[][] visited = new boolean[m][n];
            int count = 0; // 그룹 개수

            for (int x = 0; x < m; x++){
                for (int y = 0; y < n; y++){
                    if (baechu[x][y] == 1 && !visited[x][y]){
                        // 새 그룹 발견
                        dfs(x, y, m, n, baechu, visited);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    // DFS 메서드
    static void dfs(int x, int y, int m, int n, int[][] baechu, boolean[][] visited){
        visited[x][y] = true;

        // 네 방향을 순회하며 인접한 칸 탐색
        for (int d = 0; d < 4; d++){
            int nx = x + dx[d];
            int ny = y + dy[d];

            // 범위 벗어나는지 체크
            if (nx < 0 || ny < 0 || nx >= m || ny >= n) {
                continue;
            }

            // 배추가 있고, 아직 방문하지 않았다면 재귀 호출
            if (baechu[nx][ny] == 1 && !visited[nx][ny]){
                dfs(nx, ny, m, n, baechu, visited);
            }
        }
    }
}