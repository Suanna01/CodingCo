import java.io.*;

public class Main {
    // 'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");

        for (int i=0;i<a.length; i++){
            if (a[i].equals("q")) {
                System.out.println(a[i]);
                break;
            }
            else System.out.println(a[i]);
        }
    }
}
