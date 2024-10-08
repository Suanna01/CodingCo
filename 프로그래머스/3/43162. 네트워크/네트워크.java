class Solution {
    
    public void dfs(int node, int[][] computers, boolean[] visit){
        visit[node] = true;
        
        for (int i = 0; i<computers.length; i++){
            if (computers[node][i] == 1 && !visit[i]) {
                dfs(i, computers, visit);
            }
        }        
    }
    public int solution(int n, int[][] computers) {
        boolean[] visit = new boolean[n];
        int count = 0;
        
        for (int i = 0; i<n; i++){
            if (!visit[i]){
                dfs(i, computers, visit);
                count++;
            }
        }
        
        return count;
    }
}