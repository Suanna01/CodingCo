class Solution {
    int answer = 0, sum = 0;
    public void dfs(int[] numbers, int target, int index, int sum){
        index++;
        if (index==numbers.length){
            if(sum==target) answer++;
            return;
        }
        
        else {
            dfs(numbers, target, index, sum+numbers[index]);
            dfs(numbers, target, index, sum-numbers[index]);
        }
    }
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, -1, 0);
        
        return answer;
    }
}