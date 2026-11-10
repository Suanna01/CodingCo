import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        /*
        1. 기능별 걸리는 기간 구하기
        2. 1에서 구한 리스트를 순회하며 현재값보다 작거나 같을 경우까지만 더하기
        */
        
        // 1
        int[] days = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            int time = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0) {
                time++;
            }
            days[i] = time;
        }
        
        // 2
        int standard = days[0];
        int count = 1;
        List<Integer> answer = new ArrayList<>();
        for (int i = 1; i < days.length; i++) {
            if (days[i] <= standard) {
                count++;
            }
            else {
                answer.add(count);
                count = 1;
                standard = days[i];
            }
        }
        answer.add(count);
                
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}