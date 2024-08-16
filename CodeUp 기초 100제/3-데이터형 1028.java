import java.io.*;

public class Main {
    //정수 1개를 입력받아 그대로 출력해보자.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(br.readLine()); //int 타입의 최소값: -2,147,483,648 최대값 : 2,147,483,647
        //long 타입의 최소값: -9,223,372,036,854,775,808
        //long 타입의 최대값: 9,223,372,036,854,775,807
        long a = Long.parseLong(br.readLine());
        System.out.println(a);
    }
}
