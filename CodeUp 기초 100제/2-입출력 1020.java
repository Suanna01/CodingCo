import java.io.*;

public class Main {
    //'-'를 제외한 주민번호 13자리를 모두 붙여 출력한다.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String arr[] = a.split("-");

        System.out.println(arr[0]+arr[1]);
    }
}
