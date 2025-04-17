import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i<n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        int target = Integer.parseInt(br.readLine());

        Arrays.sort(num);//오름차순 정렬

        int left = 0;
        int right = n-1;
        int count = 0;

        while (left<right) {
            int currentSum = num[left] + num[right];
            if (currentSum == target){
                count++;
                left++;
                right--;
            }
            else if(currentSum < target){
                left++;
            }
            else {
                right--;
            }
        }

        System.out.println(count);
    }
}