import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        System.out.println(bfs(a, b));
    }
    public static int bfs(int start, int end) {
        boolean[] visited = new boolean[100001];
        Queue<int[]> q = new LinkedList<>();
        
        q.add(new int[]{start,0});
        visited[start] = true;
        
        while (!q.isEmpty()){
            int [] current = q.poll();
            int position = current[0];
            int time = current[1];
            
            if (position == end) return time;
            
            for (int nextPos : new int[]{position-1, position+1, position*2}) {
                if (nextPos>=0 && nextPos<=100000&&!visited[nextPos]){
                    visited[nextPos] = true;
                    q.add(new int[]{nextPos, time+1});
                }
            }
        }
        return -1;
    }
}