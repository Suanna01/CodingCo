class Solution {
    public int solution(int[] nums) {
        int result = 0;
        
        for (int i = 0; i<nums.length-2; i++){
            for (int j = i+1; j<nums.length-1; j++){
                for (int k = j+1; k<nums.length; k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    int count = 0;
                    for (int l = 2; l <= sum-1; l++){
                        if (sum%l==0) {
                            count++;
                        }
                    }
                    if (count==0) result++;
                }
            }
        }
        return result;
        
    }
}