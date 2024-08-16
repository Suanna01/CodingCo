import java.io.*;

public class Main {
    //입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다.
    public static void main(String[] args) throws IOException{
//        //1 : StringTokenizer 이용하는 방법
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), "\\.");
//
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        int c = Integer.parseInt(st.nextToken());
//
//        System.out.printf("%04d.%02d.%02d", a, b, c);
        //2 : 배열 이용하는방법
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String arr[] = s.split("\\.");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);

        System.out.printf("%04d.%02d.%02d",a,b,c);
    }
}
