class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int currentSum = 0;
        int min = Integer.MAX_VALUE;

        int currentWin = 0;
        int low = 0;
        int high = 0;

        while(high < nums.length){
            currentSum += nums[high];
            high++;

            while(currentSum>=target){
                currentWin = high - low;

                min = Math.min(min, currentWin);

                currentSum -= nums[low];
                low++;
            }
        }if(min == Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}