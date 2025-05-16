class Solution {
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, 0, target);
        return answer;
    }
    
    private void dfs(int[] numbers, int index, int sum, int target) {
        // 종료 조건
        if (index==numbers.length) {
            if (sum==target){
                answer++;
            }
            return;
        }
        
        // 재귀 호출: +, -
        dfs(numbers, index+1, sum+numbers[index], target);
        dfs(numbers, index+1, sum-numbers[index], target);
    }
}