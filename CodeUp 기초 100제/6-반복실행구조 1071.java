import java.io.*;
import java.util.*;

public class Main {
    //개수는 알 수 없는 정수가 계속 입력되는데 0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] S = br.readLine().split(" ");
//        int[] I;  //<-- 배열은 사용하기 전에 크기와 메모리를 할당해야하므로 불가능. 따라서 List 사용
        List<Integer> I = new ArrayList<>();   //변수는 List 인터페이스를 사용하여 선언되었고, 구현체로 ArrayList를 사용함.
        for (String s : S ){
            I.add(Integer.parseInt(s));
        }
        for (int i : I){
            if (i==0) break;
            else System.out.println(i);
        }
    }
}
