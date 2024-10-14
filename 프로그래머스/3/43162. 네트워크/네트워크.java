class Solution {
    public void dfs(int node, boolean[] visited, int[][] computers){
        visited[node] = true;
        for (int i = 0; i<computers.length; i++){
            if (!visited[i] && computers[node][i]==1) {
                dfs(i, visited, computers);
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int answer = 0;
        for(int i = 0; i<n; i++) {
            if (!visited[i]){
                dfs(i, visited, computers);
                answer++;
            }
        }
        return answer;
    }
}