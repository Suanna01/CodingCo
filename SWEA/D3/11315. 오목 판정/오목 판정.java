import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
	
		for (int t = 1; t <= test_case; t++) {
			boolean answer = false;
			
			int n = Integer.parseInt(br.readLine());
			char[][] omoc = new char[n][n];
			for (int i = 0; i < n; i++) {
				String s = br.readLine();
				for (int j = 0; j < n; j++) {
					omoc[i][j] = s.charAt(j);
				}
			}
			
			// 가로 체크
			for (int i = 0; i < n; i++) {
				int count = 0;
				for (int j = 0; j < n; j++) {
					if (omoc[i][j] == 'o') {
						count++;
					}
					// 연속 체크
					else {
						count = 0;
					}
					
					if (count >= 5) {
						answer = true;
						break;
					}
				}
			}
			
			
			// 세로 체크
			for (int j = 0; j < n; j++) {
				int count = 0;
				for (int i = 0; i < n; i++) {
					if (omoc[i][j] == 'o') {
						count++;
					}
					else {
						count = 0;
					}
					if (count >= 5) {
						answer = true;
						break;
					}
				}
			}
			
			
			// \대각선 체크
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					int count = 0;

					for (int k = 0; k < 5; k++) {
						int ni = i + k;
						int nj = j + k;
						
						// 범위 체크
						if (ni >= n || nj >= n) {
							break;
						}
						
						if (omoc[ni][nj] == 'o') {
							count++;
						}
						else {
							break;
						}
					}
					
					if (count >= 5) {
						answer = true;
						break;
					}
				}
			}
			
			// /대각선 체크
			for (int i = 0; i < n; i++) {
				for (int j = n - 1;  j >= 0; j--) {
					int count = 0;
					
					for (int k = 0; k < 5; k++) {
						int ni = i + k;
						int nj = j - k;
						
						if (ni >= n || nj < 0) {
							break;
						}
						
						if (omoc[ni][nj] == 'o') {
							count++;
						}
						else {
							break;
						}
					}
					
					if (count == 5) {
						answer = true;
					}
				}
			}
			
			System.out.println("#" + t + " " + ( answer ? "YES" : "NO" ));
			
		}
		
	}
}
