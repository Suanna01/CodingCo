import java.io.*;
import java.util.*;

public class Main{
    static int m, n, k;
    static boolean[][] painted; // 칠해진 칸을 표시할 배열

    static boolean[][] visited;

    static int[] dr = { -1, 1, 0, 0 }; // 행
    static int[] dc = { 0, 0, -1, 1 }; // 열

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken()); // 세로
        n = Integer.parseInt(st.nextToken()); // 가로
        k = Integer.parseInt(st.nextToken()); // 직사각형 개수

        painted = new boolean[m][n]; // 기본값 false로 초기화

        // 입력 처리: 직사각형 채우기
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            // (x1, y1) ~ (x2 - 1, y2 - 1) 범위 칠하기
            for (int row = y1; row < y2; row++){
                for (int col = x1; col < x2; col++){
                    painted[row][col] = true;
                }
            }
        }

        visited = new boolean[m][n];

        // size 저장할 리스트
        List<Integer> sizes = new ArrayList<>();

        // 전체 순회
        for (int row = 0; row < m; row++){
            for (int col = 0; col < n; col++){
                // 칠해져 있지 않고(false), 방문하지 않았을 때
                if (!painted[row][col] && !visited[row][col]){
                    int size = dfs(row, col);
                    sizes.add(size);
                }
            }
        }

        // 빈 영역의 개수 출력
        System.out.println(sizes.size());

        Collections.sort(sizes);

        StringBuilder sb = new StringBuilder();
        for (int s : sizes){
            sb.append(s).append(" ");
        }

        System.out.println(sb);
    }

    // DFS: 빈 칸의 개수 세기
    static int dfs(int row, int col) {
        // 범위 체크
        if (row < 0 || col < 0 || row >= m || col >= n){
            return 0;
        }

        // 이미 방문했거나, 칠해진 영역이면 진행 안 함
        if (visited[row][col] || painted[row][col]){
            return 0;
        }

        // 방문처리
        visited[row][col] = true;
        // size 1로 카운트
        int size = 1;

        // 네 방향으로 재귀 탐색
        for (int d = 0; d < 4; d++){
            int nextRow = row + dr[d];
            int nextCol = col + dc[d];
            size += dfs(nextRow, nextCol);
        }

        return size;
    }


}