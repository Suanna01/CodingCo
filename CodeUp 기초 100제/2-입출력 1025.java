import java.io.*;

public class Main {
    //다섯 자리의 정수 1개를 입력받아 각 자리별로 나누어 출력한다.
    //각 자리의 숫자를 분리해 한 줄에 하나씩 [ ]속에 넣어 출력한다.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String[] arr = a.split("");

        System.out.println("[" + Integer.parseInt(arr[0])*10000 + "]");
        System.out.println("[" + Integer.parseInt(arr[1])*1000 + "]");
        System.out.println("[" + Integer.parseInt(arr[2])*100 + "]");
        System.out.println("[" + Integer.parseInt(arr[3])*10 + "]");
        System.out.println("[" + Integer.parseInt(arr[4]) + "]");
    }
}
