import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        if (priorities.length == 0) {
            return 0;
        }
        
        int answer = 0;
        
        Queue<Integer> q = new LinkedList<>();
        
        for (int i = 0; i<priorities.length; i++){
            q.add(priorities[i]);
        }
        
        Arrays.sort(priorities);
        
        for (int i = 0; i < priorities.length / 2; i++) {
            int temp = priorities[i];
            priorities[i] = priorities[priorities.length - 1 - i];
            priorities[priorities.length - 1 - i] = temp;
        }
        
        int first = priorities[0];
        
        while(!q.isEmpty()){
            Integer a = q.poll();
            if (a==first){
                answer++;
                
                if (answer < priorities.length) {
                    first = priorities[answer];
                } 
                
                location--;
                if (location==-1) return answer;
            }
            else{
                location--;
                if (location==-1) location = q.size();
                q.add(a);
            }
        }
        return answer;
    }
}