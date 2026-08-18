class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return solve(0, nums, dp);
    }

    public int solve(int i, int[] nums, int[] dp){
        if(i==nums.length-1){
            return 0;
        }

        if(i>=nums.length){
            return Integer.MAX_VALUE;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int min = Integer.MAX_VALUE;

        for(int jump = 1; jump<=nums[i]; jump++){

            int result = solve(i + jump, nums, dp);

            if(result != Integer.MAX_VALUE) {
                min = Math.min(min, result);
            }
            
        }

        if(min == Integer.MAX_VALUE)
            return dp[i]=Integer.MAX_VALUE;

        dp[i] = 1+min;
        return dp[i];
    }
}