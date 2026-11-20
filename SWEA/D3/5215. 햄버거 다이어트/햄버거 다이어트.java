import java.util.*;
import java.io.*;

public class Solution {
	static int n, limit, answer;
	static int[] scores, kcals;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= test_case; t++) {
			answer = 0;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			limit = Integer.parseInt(st.nextToken());
			
			scores = new int[n];
			kcals = new int[n];
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				int s = Integer.parseInt(st.nextToken());
				int k = Integer.parseInt(st.nextToken());
				
				scores[i] = s;
				kcals[i] = k;
			}
			
			dfs(0, 0, 0);
			
			System.out.println("#" + t + " " + answer);
		}
		
	}

	static void dfs(int index, int score, int kcal) {
		// 칼로리 초과 체크
		if (kcal > limit) {
			return;
		}
		
		// 모든 재료 확인 시
		if (index == n) {
			answer = Math.max(answer, score);
			return;
		}
		
		// 1. 현재 재료 선택
		dfs(index + 1, score + scores[index], kcal + kcals[index]);
		
		// 2. 현재 재료 선택 X
		dfs(index + 1, score, kcal);
		
		
	}
}
