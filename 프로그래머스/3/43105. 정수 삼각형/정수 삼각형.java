class Solution {
    public int solution(int[][] triangle) {
        int n= triangle.length;
        
        // 아래에서 두 번째 줄부터 합 구하기
        for (int i= n-2; i>=0; i--){
            for (int j= 0; j<triangle[i].length; j++){
                triangle[i][j]+=Math.max(triangle[i+1][j], triangle[i+1][j+1]);
            }
        }
        
        return triangle[0][0];
    }
}