import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        /*
        1. 가로, 세로 중 제일 큰 수 선정하기. 
        2. [가로, 세로] 세트 중 더 작은 것 중에 제일 큰 걸 선정하기
        3. 1번 2번 곱해서 return
        */
        
        int max = 0;
        int min = 0;
        
        for (int[] size : sizes) {
            max = Math.max(max, Math.max(size[0], size[1]));
            min = Math.max(min, Math.min(size[0], size[1]));
        }
        /*
        Math.min(size[0], size[1]) → 현재 명함의 작은 변
        Math.max(min, ...) → 지금까지 발견한 작은 변 중 가장 큰 값
        */
        return max*min;
    }
}