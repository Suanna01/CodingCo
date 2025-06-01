class Solution {
    // dfs
    // 네방향 아님
    // '나'면 탐색 안해야함 (방문여부, 1인지 여부 + 나인지 여부)
    // 그룹 개수 리턴임(단, 혼자인거도 그룹 +1)
    
    // 그래프!
    // n 주어져 있었음. 입출력 확실히 보기
        
    public int solution(int n, int[][] computers) {    
        int answer = 0;
        boolean[] visited =  new boolean[n];
        
        for (int i = 0; i < n; i++){
            if (!visited[i]) {
                dfs(i, n, computers, visited);
                answer++;
            }
        }
        
        return answer;
    }
    
    private void dfs(int node, int n, int[][] computers, boolean[] visited){
        visited[node] = true;
        
        for (int i = 0; i < n; i++){
            if (!visited[i] && computers[node][i] == 1 && i != node) {
                dfs(i, n, computers, visited);
            }
        }
    }
}