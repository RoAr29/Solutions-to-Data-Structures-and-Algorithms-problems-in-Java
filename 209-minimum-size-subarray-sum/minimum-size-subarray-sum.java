class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0, high = 0;
        int currentSum = 0;

        int currentWin = Integer.MAX_VALUE;

        while(high < nums.length){
            currentSum += nums[high];
            high++;

            while(currentSum >= target){
                currentWin = Math.min(currentWin, high - low);
                
                currentSum -= nums[low];
                low++;
            }
        }
        if(currentWin == Integer.MAX_VALUE){
            return 0;
        }
        return currentWin;

    }
}