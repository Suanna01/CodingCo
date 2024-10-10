import java.io.*;
import java.util.*;

public class Main{  
  static boolean[][] a;
  static boolean[] visited;

  static StringBuilder sb = new StringBuilder();

  static int n;

  static Queue<Integer> q = new LinkedList<>();
  
  public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    int e = Integer.parseInt(st.nextToken());
    int start = Integer.parseInt(st.nextToken());

    a = new boolean[n+1][n+1];
    visited = new boolean[n+1];

    for (int i = 0; i<e; i++){
      st = new StringTokenizer(br.readLine());
      int node1 = Integer.parseInt(st.nextToken());
      int node2 = Integer.parseInt(st.nextToken());
      a[node1][node2] = true;
      a[node2][node1] = true;
    }

    dfs(start);
    sb.append("\n");

    visited = new boolean[n+1];

    bfs(start);
    
    bw.write(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }

  public static void dfs(int start){
    sb.append(start+" ");
    visited[start] = true;

    for (int i = 1; i<=n; i++){
      if (!visited[i] && a[start][i]) {
        dfs(i);
      }
    }
  }

  public static void bfs(int start){
    q.add(start);
    visited[start] = true;

    while (!q.isEmpty()){
      start = q.poll();
      sb.append(start+" ");

      for (int i = 1; i<=n; i++){
        if (!visited[i] && a[start][i]){
          q.add(i);
          visited[i] = true;
        }
      }
    }
  }
}