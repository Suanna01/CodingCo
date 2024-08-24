import java.io.*;

public class Main {
    //점수(정수, 0 ~ 100)를 입력받아 평가를 출력해보자.

    //평가 기준
    //점수 범위 : 평가
    // 90 ~ 100 : A
    // 70 ~  89 : B
    // 40 ~  69 : C
    //  0 ~  39 : D

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        if (a>=90) System.out.println("A");
        else if (a>=70) System.out.println("B");
        else if (a>=40) System.out.println("C");
        else System.out.println("D");

    }
}
