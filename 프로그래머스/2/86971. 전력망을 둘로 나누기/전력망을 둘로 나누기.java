import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = n;
        
        // i: 끊을 전선
        for (int i= 0; i<wires.length; i++){
            List<List<Integer>> graph= new ArrayList<>();
            // 그래프에 노드 번호 그대로 넣을 거라 +1 크기
            for (int j= 0; j<=n; j++){
                graph.add(new ArrayList<>());
            }
            
            // 끊긴 i전선 제외한 그래프 구성
            for (int j= 0; j<wires.length; j++){
                if (i==j) continue; // i는 이번에 끊을 전선이니까 그래프에 추가하지 않음.
                int a= wires[j][0];
                int b= wires[j][1];
                graph.get(a).add(b);  // 노드 번호 그대로 들어감.
                graph.get(b).add(a);
            }
            
            boolean[] visited= new boolean[n+1]; // 노드 번호 그대로~
            // 이건 1번 노드와 연결된 그래프의 노드 개수(끊긴 다른 그래프는 n에서 빼면 구할 수 있음.=> n-count)
            int count= dfs(1, graph, visited); // 시작 노드는 1로 고정
            // |count-(n-count)| = |count+count-n| = |2*count -n|
            int diff= Math.abs(n-2*count);  
            answer= Math.min(answer, diff);
        }
        
        return answer;
    }
    
    private int dfs(int node, List<List<Integer>> graph, boolean[] visited) {
        visited[node]= true;
        int count= 1;
        
        for (int neighbor: graph.get(node)) {
            if (!visited[neighbor]) {
                count += dfs(neighbor, graph, visited);
            }
        }
        
        return count;
    }
}