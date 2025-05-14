import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N= Integer.parseInt(br.readLine());
        int[] A= new int[N];

        StringTokenizer st= new StringTokenizer(br.readLine());
        for (int i= 0; i<N; i++){
            A[i]= Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);
        int count= 0;

        for (int k= 0; k<N; k++){
            int target= A[k];
            int left= 0;
            int right= N-1;

            while (left<right){
                if (left==k){
                    left++;
                    continue;
                }
                if (right==k){
                    right--;
                    continue;
                }

                int sum= A[left]+A[right];

                if (sum==target){
                    count++;
                    break;
                }
                else if (sum < target){
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        System.out.println(count);
    }
}