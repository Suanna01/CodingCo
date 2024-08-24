import java.io.*;

public class Main {
    //1부터 n까지, 1부터 m까지 숫자가 적힌
    //서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = {Integer.parseInt(a[0]), Integer.parseInt(a[1])};

        for (int i = 1; i<=b[0]; i++){
            for (int j=1; j<=b[1]; j++){
                System.out.printf("%d %d\n", i, j);
            }
        }
    }
}
