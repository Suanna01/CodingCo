import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }

        // 제거된 순서 저장 리스트
        LinkedList<Integer> result = new LinkedList<>();

        while (!q.isEmpty()) {
            for (int i = 1; i < k; i++) {
                q.offer(q.poll()); // k-1번 만큼 맨 앞 원소를 뒤로 보내기
            }
            result.add(q.poll()); // k번째 사람 제거하고 result에 추가
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < result.size(); i++) {
            sb.append(result.get(i));
            if (i != result.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(">");

        System.out.println(sb.toString());
    }

}