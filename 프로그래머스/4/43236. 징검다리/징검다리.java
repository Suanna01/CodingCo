import java.util.*;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        Arrays.sort(rocks);
        
        List<Integer> rockList= new ArrayList<>();
        for (int r: rocks){
            rockList.add(r);
        }
        rockList.add(distance);  // 도착 지점도 추가
        
        int left= 1;  // 0아님
        int right= distance;
        int answer = 0;
        
        // 이진 탐색
        while(left<=right){
            int mid= (left+right)/2;
            
            // 거리 mid 이상을 유지할 수 있는지 판단하기
            int removed= 0;
            int prev= 0;
            
            for (int rock: rockList){
                int gap= rock-prev;
                
                if (gap<mid){  // 바위 사이 거리가 mid보다 작다면
                    removed++; // 이 바위를 제거해야 mid 이상으로 유지 가능
                    // 즉, 현재 바위거리가 너무 짧으니까 이걸 제거해서 간격을 늘리는 것.
                }
                else {
                    prev= rock; // mid 이상이면 유지. prev 업데이트
                }
            }
            
            if (removed>n){
                right= mid-1; // 불가능한거니까 거리를 줄여가야함.
            }
            else{
                answer=mid; // 정답 후보
                left= mid+1; // 가능하니까 더 도전
            }
        }
        
    
        return answer;
    }
}