import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();
        char[] c = s.toCharArray();
        
        for (int i = 0; i < c.length; i++) {
            char a = (char) (c[i] - 3);
            if (a < 'A') {
                a += 26;
            }

            bw.write(a);
        }

        bw.flush();
        br.close();
    }
}
