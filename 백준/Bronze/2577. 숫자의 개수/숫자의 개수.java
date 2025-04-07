import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        
        int n = a*b*c;
        
        // int를 char 배열로 변환하기 위해선 int -> String -> char
        String s = Integer.toString(n);
        char[] cc = s.toCharArray();
        
        int[] nn = new int[10];
        
        for (char ch : cc){
            nn[ch-'0']++;
        }
        
        for (int i = 0; i<10; i++){
            System.out.println(nn[i]);
        }
    }
}