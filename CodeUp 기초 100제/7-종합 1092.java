import java.io.*;

public class Main {
    //같은 날 동시에 가입한 인원 3명이 규칙적으로 방문하는,
    //방문 주기가 공백을 두고 입력된다.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);

        // 최소공배수가 아닌 방법으로 해결해보기
        int day = 1;
        while(day%a!=0 || day%b!=0 || day%c!=0) day++;

        bw.write(String.valueOf(day));
        bw.flush();
    }
}
