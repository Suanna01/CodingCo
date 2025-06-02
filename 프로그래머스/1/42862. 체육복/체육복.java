class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        boolean[] lostFlag = new boolean[n+1];
        boolean[] reserveFlag = new boolean[n+1];
        
        for (int x : lost){
            lostFlag[x] = true;
        }
        
        for (int x : reserve){
            reserveFlag[x] = true;
        }
        
        // 본인이 여벌옷을 입는 경우
        for (int i = 1; i <= n; i++){
            if (lostFlag[i] && reserveFlag[i]) {
                lostFlag[i] = false;
                reserveFlag[i] = false;
            }
        }
        
        // 빌려주기
        for (int i = 1; i <= n; i++) {
            if (lostFlag[i]) { // 체육복이 없는 경우
                if (i - 1 >= 1 && reserveFlag[i - 1]) { // 왼쪽 학생이 여벌이 있으면
                    reserveFlag[i - 1] = false;
                    lostFlag[i] = false;                    
                }
                else if (i + 1 <= n && reserveFlag[i + 1]) { // 오른쪽 학생이 여벌이 있으면
                    reserveFlag[i + 1] = false;
                    lostFlag[i] = false; 
                }
            }
        }
        
        int count = 0;
        for (int i = 1; i <= n; i++){
            if (!lostFlag[i]) { // 체육복이 있는 사람
                count++;
            }
        }
        
        return count;
    }
}