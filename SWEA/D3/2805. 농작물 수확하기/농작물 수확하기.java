import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= test_case; t++) {
			int n = Integer.parseInt(br.readLine());
			
			int[][] farm = new int[n][n];
			
			for (int i = 0; i < n; i++) {
				String s = br.readLine();
				for (int j = 0; j < n; j++) {
					farm[i][j] = s.charAt(j) - '0';
				}
			}
			
			int sum = 0;
			int mid = n / 2;
			
			for (int i = 0; i < n; i++) {
				int range = mid - Math.abs(mid - i);
				for (int j = mid - range; j <= mid + range; j++) {
					sum += farm[i][j];					
				}
			}
			
			
			
			System.out.println("#" + t + " " + sum);
		}
		
	}
}
