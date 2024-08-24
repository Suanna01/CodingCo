import java.io.*;

public class Main {
    //세 정수 a, b, c가 입력되었을 때, 짝(even)/홀(odd)을 출력해보자.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);

        int[] A = {a, b, c};
        for (int i : A){
            if (i%2==0) System.out.println("even");
            else System.out.println("odd");
        }
    }
}
