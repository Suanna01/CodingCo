import java.io.*;

public class Main {
    //실수 1개 입력받아 그대로 출력하기2
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // float : - 3.4*10^-38 ~ + 3.4*10^38 범위
        // double : - 1.7*10^-308 ~ + 1.7*10^308 범위
        Double a = Double.parseDouble(br.readLine());

        //입력된 실수를 소수점 이하 11자리까지 반올림하여 출력한다.
        System.out.printf("%.11f",a);
    }
}
