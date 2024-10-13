import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    
    StringTokenizer st;
    
    int n = Integer.parseInt(br.readLine());

    String[][] a = new String[n][2];
    
    for (int i = 0; i<n; i++){
      st = new StringTokenizer(br.readLine());
      a[i][0] = st.nextToken();
      a[i][1] = st.nextToken();
    }

    Arrays.sort(a, new Comparator<String[]>() {
      @Override
      public int compare(String[] a, String[] b){
        return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
      }
    });

    for (int i = 0; i<n; i++){
      sb.append(a[i][0]+ " " + a[i][1]+ "\n");
    }

    bw.write(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }
}