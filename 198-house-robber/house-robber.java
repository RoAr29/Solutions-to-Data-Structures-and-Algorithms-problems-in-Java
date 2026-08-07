
class Solution {
public int rob(int[] nums) {

    int[] dp = new int[nums.length+2];
    int n = nums.length;

    dp[n] = 0;
    dp[n+1] = 0;
    
    for(int i=n-1; i>=0; i--){
       dp[i] = Math.max(dp[i+2] + nums[i], dp[i+1]);
    }

    return dp[0];
}

}
