import java.io.*;
import java.util.*;

public class Main {
    //입력되는 시:분:초 에서 분만 출력해보자.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),":");
        st.nextToken();
        System.out.println(Integer.parseInt(st.nextToken()));
    }
}
