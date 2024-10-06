import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int mm = m-45;
        if (mm<0) {
            mm = 60+mm;
            h-=1;
            if (h < 0){
                h = 23;
            }
        }
        
        System.out.println(h+" "+mm);
    }
}