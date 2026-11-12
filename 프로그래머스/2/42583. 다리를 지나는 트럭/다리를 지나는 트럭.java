import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        // 트럭 위를 나타내는 큐를 0으로 채우고 시작하기 (트럭이 없는 빈공간을 나타냄)
        // 0은 일종의 시간을 나타내는 공간 (새로운 트럭이 들어오지 못해도, 시간이 계속 흐르기 위함)
        /*
        1. truck_weights 배열을 index로 관리
        2. 다리 위 큐 생성
        3. 모든 트럭 반복문(한 번 당 1초) 
            4. 경과 시간 +1
            5. 다리 위 큐 하나 빼고, 다리 위 무게에서 빼기
            6. 다음 트럭이 올라와도 weight를 넘지 않는다면,
                7. 큐에 포함시키기
            8. 안된다면
                9. 0을 추가하기
        */
        
        Queue<Integer> bridge = new ArrayDeque<>();
        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }
        
        int time = 0;
        int index = 0;
        int currentWeight = 0;
        while (index < truck_weights.length) {
            time++;
            currentWeight -= bridge.poll();
            if (currentWeight + truck_weights[index] <= weight) {
                currentWeight += truck_weights[index];
                bridge.offer(truck_weights[index]);
                index++;
            }
            else {
                bridge.offer(0);
            }
        }
        
        return time + bridge_length;
    }
}