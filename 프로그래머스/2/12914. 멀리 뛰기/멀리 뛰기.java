class Solution {
    public long solution(int n) {
        if (n==1) return 1;
        
        long[] dp= new long[n+1]; // i칸까지 고려
        dp[1]= 1; // 1칸까지 가는 경우는 1가지(1)
        dp[2]= 2; // 2칸까지 가는 경우는 2가지(1->1, 2)
        
        for (int i= 3; i<=n; i++){
            dp[i]= (dp[i-1]+dp[i-2]) % 1234567;  // 점화식에 mod 포함 가능
        }
        
        return dp[n];
    }
}