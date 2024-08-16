import java.io.*;

public class Main {
    //단어의 문자(영어)를 하나씩 나누어 한 줄에 한 개씩
    //' '로 묶어서 출력한다.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String[] arr = A.split("");

//        for(int i=0;i<arr.length;i++){
//            System.out.printf("'%s'", arr[i]);
//        }
        for (String s : arr) {
            System.out.printf("'%s'\n", s);
        }
    }
}
