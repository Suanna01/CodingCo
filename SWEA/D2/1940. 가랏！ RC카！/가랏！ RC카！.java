import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        for (int i = 1; i <= test_case; i++) {
            int command_count = Integer.parseInt(br.readLine());
            int distance = 0;
            int speed = 0;
            for (int j = 0; j < command_count; j++) {
            	StringTokenizer st = new StringTokenizer(br.readLine());
                int command = Integer.parseInt(st.nextToken());
                if (command == 0) {
                    // 유지
                    distance += speed;
                }
                else if (command == 1) {
                    // 가속
                    speed += Integer.parseInt(st.nextToken());
                    distance += speed;
                }
                else {
                    // 감속
                    speed = Math.max(0, speed - Integer.parseInt(st.nextToken()));
                    distance += speed;
                }
            }
            System.out.println("#" + i + " " + distance);
        }
	}
}