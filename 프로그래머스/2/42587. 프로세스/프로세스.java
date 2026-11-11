import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new ArrayDeque<>();
        
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]});
        }
        
        int answer = 0;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            boolean hasHigher = false;
            
            for (int[] priority : queue) {
                // 대기 중인 프로세스 중 현재 값보다 큰게 있다면,
                if (priority[1] > current[1]) {
                    hasHigher = true;
                }
            }
            
            // 우선순위가 더 높은게 있다면,
            if (hasHigher) {
                // 현재 값 꺼내서 다시 큐에 넣기.
                queue.offer(current);                    
            } 
            // 현재 나간 게 제일 높았다면,
            else { 
                answer++;
                // location이랑 인덱스가 같은지 검사하기
                if (location == current[0]) {
                    return answer;
                }
                
            }
            
        }
        
        return answer;
    }
}