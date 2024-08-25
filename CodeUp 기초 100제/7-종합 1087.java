import java.io.*;

public class Main {
    //언제까지 합을 계산할 지, 정수 1개를 입력받는다.
    //1부터 순서대로 더해가다가, 그 합이 입력된 정수보다 커지거나 같아지는 경우,
    //그때까지의 합을 출력한다.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int sum = 0, i = 1;

        while(sum<a) {
            sum += i;
            i++;
        }

        bw.write(String.valueOf(sum));  //String.valueOf() 필수
        bw.flush();
    }
}
