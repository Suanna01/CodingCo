import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        // 진출 시점을 기준으로 정렬
        Arrays.sort(routes, (a,b) -> Integer.compare(a[1], b[1]));
        
        int camera= Integer.MIN_VALUE; // 마지막으로 설치한 카메라 위치
        int answer= 0; // 설치한 카메라 수
        
        for (int[] route: routes) {
            // 현재 차량이 기존 카메라로 커버 안되면 새로 설치
            if (route[0]> camera) { // 현재 차량의 진입 시점 > 마지막으로 설치된 카메라 위치
                camera= route[1]; // 해당 차량의 진출 시점에 새로 설치
                answer++;
            }
        }
        
        return answer;
    }
}