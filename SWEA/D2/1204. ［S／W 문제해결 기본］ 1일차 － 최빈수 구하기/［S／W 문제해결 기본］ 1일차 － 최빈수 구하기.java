import java.io.*;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int tastCase = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] score = new int[101];
            for (int j = 0; j < 1000; j++) {
               	int s = Integer.parseInt(st.nextToken());
                score[s]++;
            }
            int max = 0;
            int answer = 0;
            /*
            for (int k = 0; k < 101; k++) {
                if (score[k] >= max) {
                    max = score[k];
                  	answer = k;
                }
            }
            */
            for (int k = 100; k >= 0; k--) {
                if (score[k] > max) {
                    max = score[k];
                    answer = k;
                }
            }
            
            System.out.println("#"+tastCase+" " +answer);
        }
	}
}