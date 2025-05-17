import java.util.*;

class Solution {
    public int solution(int N, int[][] road, int K) {
        // 노드 연결을 저장할 인접 리스트 생성
        List<List<Node>> graph= new ArrayList<>();
        
        // 0번 인덱스 비워둠
        for (int i= 0; i<=N; i++){
            graph.add(new ArrayList<>());
        }
        
        for (int[] r: road){
            int a= r[0]; //출발 마을
            int b= r[1]; //도착 마을
            int c= r[2]; //소요 시간
            
            // 양방향이니까 두 노드에 추가
            graph.get(a).add(new Node(b,c));  // a번 노드에 b가 연결되어 있고, c만큼 걸림.
            graph.get(b).add(new Node(a,c));
        }
        
        // 최단거리 배열(해당 노드까지 걸리는 최소 시간)
        int[] distance= new int[N+1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[1]=0; // 시작점인 1번 노드는 0으로 설정
        
        // 우선순위 큐
        PriorityQueue<Node> pq= new PriorityQueue<>(Comparator.comparingInt(n -> n.time));
        pq.add(new Node(1,0)); // 시작노드 삽입
     
        // 다익스트라
        while (!pq.isEmpty()){
            Node now= pq.poll();
            
            // now.target 마을에 더 빠른 시간으로 도착한 적이 있으면 넘김.
            if (now.time> distance[now.target]) continue;
            
            // now.target에서 갈 수 있는 노드(==graph.get(now.target)) 탐색
            for (Node next: graph.get(now.target)) {
                int newTime= distance[now.target]+ next.time;
                if (newTime < distance[next.target]) {
                    distance[next.target]= newTime; // 거쳐서 가는게 더 빠르면 갱신
                    pq.add(new Node(next.target, newTime)); // 이 노드에서 연결된 또다른 경로를 확인하기 위해 다시 큐에 넣음.
                }
            }
        }
        
        int count= 0;
        for (int i= 1; i<=N; i++){
            if (distance[i] <= K) {
                count++;
            }
        }
        
        return count;        
    }
}

class Node{
    int target;
    int time;
    
    Node(int target, int time){
        this.target= target;
        this.time= time;
    }
}