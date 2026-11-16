import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int test_case = Integer.parseInt(br.readLine());
        for (int t = 1; t <= test_case; t++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m  = Integer.parseInt(st.nextToken());
            
            int[][] fly = new int[n][n];
           	for (int x = 0; x < n; x++) {
                st = new StringTokenizer(br.readLine());
                for (int y = 0; y < n; y++) {
                    fly[x][y] = Integer.parseInt(st.nextToken());
                }
            }
            
            int max_kill = 0;
            for (int i = 0; i <= n - m; i++) {
                for (int j = 0; j <= n - m; j++) {
                    // [i, j]는 시작위치
            		int kill_count = 0;
                    for (int x = i; x < i + m; x++) {
                        for (int y = j; y < j + m; y++) {
                            // [x, y] 파리채 내부 이동 위치
                            kill_count +=fly[x][y];
                        }
                    }
                    max_kill = Math.max(max_kill, kill_count);
                }
            }
            System.out.println("#"+t+" "+max_kill);
            
        }
	}
}