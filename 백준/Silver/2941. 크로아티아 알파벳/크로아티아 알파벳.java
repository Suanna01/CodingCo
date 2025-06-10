import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int count = 0;

        int i = 0;

        while (i < input.length()) {
            // dz= 패턴 먼저 찾기
            if (i+2 < input.length() && input.substring(i, i+3).equals("dz=")){
                count++;
                i += 3;
            }
            // 두 글자가 남았을 때 패턴인지 아닌지 체크
            else if (i+1 < input.length()) {
                String two = input.substring(i, i+2);
                if (two.equals("c=") || two.equals("c-") ||
                        two.equals("d-") || two.equals("lj") ||
                        two.equals("nj") || two.equals("s=") ||
                        two.equals("z=")) {
                    count++;
                    i += 2;
                }
                else {
                    count++;
                    i++;
                }
            }
            // 마지막 한 글자
            else {
                count++;
                i++;
            }

        }

        System.out.println(count);
    }
}