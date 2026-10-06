import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        int n = nums.length/2;
        
        answer = Math.min(n, set.size());
        
        return answer;
    }
}