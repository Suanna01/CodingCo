import java.io.*;
import java.util.*;

public class Main{
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 입력 처리
        int[][] dohwaji = new int[n][m];
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++){
                dohwaji[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited = new boolean[n][m];

        int groupCount = 0;

        List<Integer> sizes = new ArrayList<>();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (!visited[i][j] && dohwaji[i][j] == 1) {
                    int size = dfs(i, j, n, m, dohwaji, visited);
                    groupCount++;
                    sizes.add(size);
                }
            }
        }

        System.out.println(groupCount);
        if (sizes.isEmpty()){
            System.out.println(0);
        }
        else {
            System.out.println(Collections.max(sizes));
        }
    }

    static int dfs(int x, int y, int n, int m, int[][] dohwaji, boolean[][] visited){
        visited[x][y] = true;
        int size = 1;

        for (int d = 0; d < 4; d++){
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (nx < 0 || ny < 0 || nx >= n || ny >= m){
                continue;
            }

            if (!visited[nx][ny] && dohwaji[nx][ny] == 1){
                size += dfs(nx, ny, n, m, dohwaji, visited);
            }

        }

        return size;
    }
}