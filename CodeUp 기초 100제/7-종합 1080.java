import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        //1, 2, 3 ... 을 계속 더해 나갈 때,
        //그 합이 입력한 정수(0 ~ 1000)보다 같거나 작을 때까지
        //계속 더하는 프로그램을 작성해보자.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int sum=0, i =0;

        while(sum<a){
            i++;
            sum+=i;
        }
        System.out.println(i);
    }
}
