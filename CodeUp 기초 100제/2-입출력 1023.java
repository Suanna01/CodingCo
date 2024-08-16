import java.io.*;

public class Main {
    //실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력한다.
    public static void main(String[] args) throws IOException{
//        //1. StringTokenizer 사용
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), "."); //StringTokenizer는 구분자가 정규식이 아닌 단순 문자로 취급되므로 특별한 처리 없이 바로 사용할 수 있다.
//
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//
//        System.out.println(a);
//        System.out.println(b);
        //2. 배열 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String arr[] = A.split("\\."); //split() 메서드에서는 정규식이 사용되므로 메타 문자인 .을 이스케이프하여 \\.으로 표현해야 한다.
        //이스케이프 처리하기 위해 \.을 사용해야 하지만, 문자열에서 역슬래시(\)는 또 한 번 이스케이프 처리를 해서 .으로 만들기 때문에, split("\\.")처럼 두 번의 역슬래시를 써서 정규식을 사용해야한다.

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        System.out.println(a);
        System.out.println(b);
    }
}
