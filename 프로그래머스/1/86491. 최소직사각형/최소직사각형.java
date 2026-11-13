import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        /*
        1. 가로, 세로 중 제일 큰 수 선정하기. 
        2. 나머지 중, 
            [가로, 세로] 세트 중 더 작은 것 중에 제일 큰 걸 선정하기
        3. 1번 2번 곱해서 return
        */
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (sizes[i][j] > max) {
                    max = sizes[i][j];
                } 
            }
        }
        
        int[] minArray = new int[sizes.length];
        for (int i = 0; i < sizes.length; i++) {
            minArray[i] = Math.min(sizes[i][0], sizes[i][1]); // [가로, 세로] 두 세트 중 더 작은 것.
        }
        int maxOfMin = Integer.MIN_VALUE;
        for (int i = 0; i < minArray.length; i++) {
            if (minArray[i] > maxOfMin) {
                maxOfMin = minArray[i];
            }
        }
        
        return max*maxOfMin;
    }
}