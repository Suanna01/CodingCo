import java.io.*;

public class Main {
    // 정수 1개를 입력받는다. (1 ~ 100)
    // 1부터 입력한 정수보다 작거나 같을 때까지 1씩 증가시켜 출력하되
    //3의 배수는 출력하지 않는다.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        for (int i =1; i<=a; i++){
            if (i%3!=0) bw.write(String.format("%d ", i));
        }

        bw.flush();
    }
}
