import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int[] count1=new int[26];
        int[] count2=new int[26];

        for (char ch: str1.toCharArray()){
            count1[ch-'a']++;
        }

        for (char ch: str2.toCharArray()){
            count2[ch-'a']++;
        }

        int deleteCount=0;
        for (int i = 0;i<26;i++){
            deleteCount+=Math.abs(count1[i]-count2[i]);
        }

        System.out.println(deleteCount);
    }
}