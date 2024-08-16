import java.io.*;

public class Main {
    //년월일(yyyy.mm.dd)를 입력받아,
    //일월년(dd-mm-yyyy)로 출력해보자.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String[] arr = a.split("\\.");

        System.out.printf("%s-%s-%s", arr[2], arr[1], arr[0]);
    }
}
