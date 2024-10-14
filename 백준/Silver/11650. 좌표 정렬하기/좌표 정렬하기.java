import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    int n = Integer.parseInt(br.readLine());

    int[][] a = new int[n][2];
    
    for (int i = 0; i<n; i++){
      st = new StringTokenizer(br.readLine());
      a[i][0] = Integer.parseInt(st.nextToken());
      a[i][1] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(a, new Comparator<int[]>() {
      @Override
      public int compare(int[] a, int[] b){
        if (a[0] == b[0]) {
          return a[1] - b[1];
        }
        return a[0] - b[0];
      }
    });

    for (int i = 0; i<n; i++) {
      sb.append(a[i][0] + " " + a[i][1] + "\n");
    }

    bw.write(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }
}