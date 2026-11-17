import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= test_case; t++) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int[] price = new int[n];
			
			int max = 0;
			long profit = 0;

			for (int i = 0; i < n; i++) {
				price[i] = Integer.parseInt(st.nextToken());				
			}
			
			for (int i = n - 1; i >= 0; i--) {
				if (price[i] > max) {
					max = price[i];
				}
				else {
					profit += max - price[i];
				}
			}
			
			System.out.println("#" + t + " " + profit);
			
		}
		
	}
}
