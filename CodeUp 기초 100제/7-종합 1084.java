import java.io.*;

public class Main {
    //빨녹파(r, g, b) 각 빛의 강약에 따른 가짓수(0 ~ 128))가 공백을 사이에 두고 입력된다.
    //만들 수 있는 rgb 색의 정보를 오름차순으로
    //줄을 바꿔 모두 출력하고, 마지막에 그 개수를 출력한다.
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] a = br.readLine().split(" ");

        int count = 0;
        for (int i = 0; i<Integer.parseInt(a[0]); i++){
            for (int j = 0; j<Integer.parseInt(a[1]); j++){
                for (int k = 0; k<Integer.parseInt(a[2]); k++){
                    bw.write(i+" "+j+" "+k+"\n");
                    count++;
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}
