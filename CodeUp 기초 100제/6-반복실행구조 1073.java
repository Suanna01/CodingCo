import java.io.*;

public class Main {
    //0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] S = br.readLine().split(" ");
        for (String s: S){
            if (s.equals("0")) break;
            else System.out.println(s);
        }
    }
}
