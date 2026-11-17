import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		
		int[][] sd = new int[9][9];
		for (int t = 1; t <= test_case; t++) {
			for (int i = 0; i < 9; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 9; j++) {
					sd[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			boolean valid = true;
			// 가로&세로 체크
			for (int i = 0; i < 9; i++) {
				boolean[] row_check = new boolean[10];
				boolean[] col_check = new boolean[10];
				
				for (int j = 0; j < 9; j++) {
					int row_num = sd[i][j];
					int col_num = sd[j][i];
					
					if (row_check[row_num] || col_check[col_num]) { // 중복 등장 시
						valid = false;
						break;
					}
					row_check[row_num] = true;
					col_check[col_num] = true;
				}
				if (!valid) break;
			}
			
			// 3*3 체크
			for (int i = 0; i < 9; i += 3) {
			    for (int j = 0; j < 9; j += 3) {
			    	
			    	boolean[] check = new boolean[10];
			    	
			    	for (int r = i; r < i + 3; r++) {
			    		for (int c = j; c < j + 3; c++) {
			    			int num = sd[r][c];
			    			
			    			if (check[num]) {
			    				valid = false;
			    				break;
			    			}
			    			
			    			check[num] = true;
			    			
			    		}
			    		if (!valid) break;
			    	}
			    	if (!valid) break;
			    }
			    if (!valid) break;
			}
			
			
			System.out.println("#" + t + " " + (valid ? 1 : 0));
		}
		
	}
}
