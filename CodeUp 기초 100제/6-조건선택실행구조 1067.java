import java.io.*;

public class Main {
    //정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        if (a<0) {
            System.out.println("minus");
            if (a%2==0) System.out.println("even");
            else System.out.println("odd");
        }

        else {
            System.out.println("plus");
            if (a%2==0) System.out.println("even");
            else System.out.println("odd");
        }

    }

}
